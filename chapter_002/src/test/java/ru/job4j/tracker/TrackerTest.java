package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenDelete2() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        Item bug2 = new Item("Bug2");
        Item bug3 = new Item("Bug3");
        Item bug4 = new Item("Bug4");
        tracker.add(bug);
        tracker.add(bug2);
        tracker.add(bug3);
        tracker.add(bug4);
        assertThat(tracker.findAll().size(), is(4));
        int id = bug2.getId();
        tracker.delete(id);
        assertThat(tracker.findAll().size(), is(3));
    }

}