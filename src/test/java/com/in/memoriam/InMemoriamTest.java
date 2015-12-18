package com.in.memoriam;

import org.junit.Assert;
import org.junit.Test;

public class InMemoriamTest {

    private static final int ID = 123;

    private final InMemoriam inMemoriam = new InMemoriam();

    @Test
    public void shouldWriteObjects() {
        inMemoriam.write(ID, "some object");
    }

    @Test
    public void shouldDeleteObjects() {
        inMemoriam.delete(ID);
    }

    @Test
    public void shouldOnlyReadFromAfterLife() {
        try {
            inMemoriam.read(ID);
        } catch (RuntimeException e) {
            Assert.assertEquals("Read is allowed only in afterlife!", e.getMessage());
        }
    }

}
