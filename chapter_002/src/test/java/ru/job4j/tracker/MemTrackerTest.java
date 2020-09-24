package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class MemTrackerTest {

    @Test
    public void whenReplace() {
        MemTracker memTracker = new MemTracker();
        Item bug = new Item();
        bug.setName("Bug");
        memTracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        memTracker.replace(id, bugWithDesc);
        assertThat(memTracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        MemTracker memTracker = new MemTracker();
        Item bug = new Item();
        bug.setName("Bug");
        memTracker.add(bug);
        int id = bug.getId();
        memTracker.delete(id);
        assertThat(memTracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenDelete2() {
        MemTracker memTracker = new MemTracker();
        Item bug = new Item();
        bug.setName("Bug");
        Item bug2 = new Item("Bug2");
        Item bug3 = new Item("Bug3");
        Item bug4 = new Item("Bug4");
        memTracker.add(bug);
        memTracker.add(bug2);
        memTracker.add(bug3);
        memTracker.add(bug4);
        assertThat(memTracker.findAll().size(), is(4));
        int id = bug2.getId();
        memTracker.delete(id);
        assertThat(memTracker.findAll().size(), is(3));
    }

}