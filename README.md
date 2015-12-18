# in-memoriam - write now, read in the afterlife
###Lightweight, super fast, atomic, transactional in-memory database.
###A place where objects lay to rest.
###Full source code:
```java
public class InMemoriam {

    public void write(long id, Object o) {}

    public void delete(long id) {}

    public void read(long id) {
        throw new RuntimeException("Read is allowed only in afterlife!");
    }

}
```
