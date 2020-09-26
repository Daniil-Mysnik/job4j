package ru.job4j.tracker;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class SqlTrackerTest {

    public Connection init() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            return DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Test
    public void createItem() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("name"));
            assertThat(tracker.findByName("name").size(), is(1));
        }
    }

    @Test
    public void testReplaceItem() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = tracker.add(new Item("name"));
            String id = String.valueOf(item.getId());
            tracker.replace(id, new Item("newName"));
            Item itemFromDB = tracker.findById(id);
            assertEquals("newName", itemFromDB.getName());
        }
    }

    @Test
    public void testDeleteItem() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = tracker.add(new Item("name"));
            tracker.delete(String.valueOf(item.getId()));
            assertNull(tracker.findById(String.valueOf(item.getId())));
        }
    }

    @Test
    public void testFindAll() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("name1"));
            tracker.add(new Item("name2"));
            tracker.add(new Item("name3"));
            assertEquals(3, tracker.findAll().size());
            assertEquals(tracker.findAll().stream().map(Item::getName).collect(Collectors.toList()), Arrays.asList("name1", "name2", "name3"));
        }
    }

    @Test
    public void testFindByName() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("name"));
            tracker.add(new Item("name"));
            assertEquals(2, tracker.findByName("name").size());
        }
    }

    @Test
    public void testFindById() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = tracker.add(new Item("name"));
            assertEquals("name", tracker.findById(String.valueOf(item.getId())).getName());
        }
    }

}