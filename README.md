# in-memoriam - write now, read in the afterlife
###Lightweight, super fast, ACID transactional in-memory database!
###It is RESTful - A place where objects lay to rest.
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

###Features:
- Using cutting-edge persistence algorithms
- High quality, 100% test coverage
- Optimized for performance using Zero GC Pressure (TM) technology
- Flawless integration with any other Java technology
