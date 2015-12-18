package com.in.memoriam;

public class InMemoriam {

	public void write(Object o) {}
	public void delete(ID id) {}
	public void read(Criteria criteria) { throw new RuntimeException("Read allowed only in afterlife.");}

}