#### What is Singleton design pattern?
---

- The Singleton method or Singleton Design pattern is one of the simplest design patterns. It ensures a class only has one instance, and provides a global point of access to it.
#### When to use Singleton Method Design Pattern?
---
- There must be exactly one instance of a class and it must be accessible to clients from a well-known access point.
- When the sole instance should be extensible by subclassing and clients should be able to use an extended instance without modifying
- Singleton classes are used for logging, driver objects, caching, and thread pool, database connections.
#### Initialization Types of Singleton
---
Singleton class can be instantiated by two methods:

- ****Early initialization :**** In this method, class is initialized whether it is to be used or not. The main advantage of this method is its simplicity. You initiate the class at the time of class loading. Its drawback is that class is always initialized whether it is being used or not.

- ****Lazy initialization :**** In this method, class in initialized only when it is required. It can save you from instantiating the class when you don’t need it. Generally, lazy initialization is used when we create a singleton class.
#### Key Component of Singleton Method Design Pattern
---
- Static Member:
	- The Singleton pattern or pattern Singleton employs a static member within the class. This static member ensures that memory is allocated only once, preserving the single instance of the Singleton class.
	``` java
		// Static member to hold the single instance
		private static Singleton instance; 
	```
- Private Constructor:
	- The Singleton pattern or pattern singleton incorporates a private constructor, which serves as a barricade against external attempts to create instances of the Singleton class. This ensures that the class has control over its instantiation process.
	``` java
		// Private constructor to
	// prevent external instantiation
	class Singleton {
	
	    // Making the constructor as Private
	    private Singleton()
	    {
	        // Initialization code here
	    }
	}
	```

- Static Factory Method:
	- A crucial aspect of the Singleton pattern is the presence of a static factory method. This method acts as a gateway, providing a global point of access to the Singleton object. When someone requests an instance, this method either creates a new instance (if none exists) or returns the existing instance to the caller.
``` java
	// Static factory method for global access
	public static Singleton getInstance()
	{
	    // Check if an instance exists
	    if (instance == null) {
	        // If no instance exists, create one
	        instance = new Singleton();
	    }
	    // Return the existing instance
	    return instance;
	}
```


#### Different Ways to Implement Singleton Method Design Pattern
---

###### Method 1 :  Classic Implementation || Make getInstance() static to implement Singleton Method Design Pattern

``` java
// Classical Java implementation of singleton
// design pattern
class Singleton {
    private static Singleton obj;

    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton() {}

    public static Singleton getInstance()
    {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }
}
```
- Here we have declared ***getInstance()*** static so that we can call it without instantiating the class. The first time **getInstance()** is called it creates a new singleton object and after that, it just returns the same object.
- ****Note:**** Singleton obj is not created until we need it and call the ****getInstance()**** method. This is called lazy instantiation. The main problem with the above method is that it is not thread-safe. Consider the following execution sequence.
- This execution sequence creates two objects for the singleton. Therefore this classic implementation is not thread-safe.


###### Method 2: Make *getInstance()* synchronized to implement Singleton Method Design Pattern

``` java
// Thread Synchronized Java implementation of
// singleton design pattern
class Singleton {
    private static Singleton obj;
    private Singleton() {}

    // Only one thread can execute this at a time
    public static synchronized Singleton getInstance()
    {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }
}
```

- Here using synchronized makes sure that only one thread at a time can execute ***getInstance()****.
- The main disadvantage of this method is that using synchronized every time while creating the singleton object is expensive and may decrease the performance of your program. 
- However, if the performance of ***getInstance()*** is not critical for your application this method provides a clean and simple solution.

###### Method 3: Eager Instantiation || Static initializer based implementation of singleton design pattern

``` java
// Static initializer based Java implementation of
// singleton design pattern
class Singleton {
    private static Singleton obj = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() { return obj; }
}
```

- Here we have created an instance of a singleton in a static initializer. JVM executes a static initializer when the class is loaded and hence this is guaranteed to be thread-safe. Use this method only when your singleton class is light and is used throughout the execution of your program

###### Method 4: Most Efficient || Use “Double Checked Locking” to implement singleton design pattern

- If you notice carefully once an object is created synchronization is no longer useful because now obj will not be null and any sequence of operations will lead to consistent results. So we will only acquire the lock on the getInstance() once when the obj is null. This way we only synchronize the first way through, just what we want.
``` java
// Double Checked Locking based Java implementation of
// singleton design pattern
class Singleton {
    private static volatile Singleton obj = null;
    private Singleton() {}

    public static Singleton getInstance()
    {
        if (obj == null) {
            // To make thread safe
            synchronized (Singleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj == null)
                    obj = new Singleton();
            }
        }
        return obj;
    }
}
```

#### Advantages of Singleton Method Design Pattern:
---

- ***Solves Name Collisions:*** In scenarios where a single point of control is needed to avoid naming conflicts or collisions, the Singleton pattern ensures that there is only one instance with a unique name.
- ***Eager or Lazy Initialization:*** The Singleton pattern supports both eager initialization (creating the instance when the class is loaded) and lazy initialization (creating the instance when it is first requested), providing flexibility based on the use case.
- ***Thread Safety:** Properly implemented Singleton patterns can provide thread safety, ensuring that the instance is created atomically and that multiple threads do not inadvertently create duplicate instances.
- **Reduced Memory Footprint:** In applications where resource consumption is critical, the Singleton pattern can contribute to a reduced memory footprint by ensuring that there is only one instance of the class.

#### Disadvantages of Singleton Design Pattern
---
- ***Testing Difficulties:** Because Singletons introduce global state, unit testing can become challenging. Testing one component in isolation may be more complicated if it relies on a Singleton, as the state of the Singleton may affect the outcome of tests.
- ***Concurrency Issues:*** In a multi-threaded environment, there can be issues related to the creation and initialization of the Singleton instance. If multiple threads attempt to create the Singleton simultaneously, it can result in race conditions.
- ***Limited Extensibility:*** The Singleton pattern can make code less extensible. If you later decide that you need multiple instances of the class or want to change the instantiation logic, it may require significant refactoring.
- ***Global Dependency:** The Singleton pattern creates a global dependency, making it harder to replace the Singleton with an alternative implementation or to use dependency injection for providing instances.
- **Hard to Subclass:*** Subclassing a Singleton can be challenging. Because the constructor is typically private, extending a Singleton requires additional care and may not follow standard inheritance patterns.
- ***Lifecycle Management:*** The Singleton pattern may not handle scenarios where the instance needs to be explicitly destroyed or reset. Managing the lifecycle of the Singleton can become a concern.
- **Global Access Point Abuse:** While a global access point is an advantage, it can also be abused. Developers might be tempted to use the Singleton for everything, leading to an overuse of global state and a less modular design.