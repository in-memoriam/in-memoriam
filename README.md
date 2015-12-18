# in-memoriam - write now, read in the afterlife
###Lightweight, super fast, atomic, transactional in-memory database.
###A place where objects lay to rest.
###Implementation details
```java
public class InMemoriam {

	public void write(Object o) {}
	public void delete(ID id) {}
	public void read(Criteria criteria) { throw new RuntimeException("Read allowed only in afterlife.");}

}
```
