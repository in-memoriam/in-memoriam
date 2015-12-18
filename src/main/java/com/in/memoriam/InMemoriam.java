package com.in.memoriam;

public class InMemoriam {

    public void write(long id, Object o) {}

    public void delete(long id) {}

    public void read(long id) {
        throw new RuntimeException("Read is allowed only in afterlife!");
    }

}