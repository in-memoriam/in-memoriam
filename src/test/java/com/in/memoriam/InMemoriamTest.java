package com.in.memoriam;

import org.junit.Assert;
import org.junit.Test;

public class InMemoriamTest {

    private InMemoriam inMemoriam = new InMemoriam();

    @Test
    public void shouldWriteObjects() {
        inMemoriam.write("some object");
    }

    @Test
    public void shouldDeleteObjects() {
        inMemoriam.delete(new ID() {
        });
    }

    @Test
    public void shouldOnlyReadFromAfterLife() {
        try {
            inMemoriam.read(new Criteria() {
            });
        } catch (RuntimeException e) {
            Assert.assertEquals("Read allowed only in afterlife.", e.getMessage());
        }
    }

}