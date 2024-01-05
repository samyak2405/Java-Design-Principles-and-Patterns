# Singleton Design Pattern

## Definition

Singleton Design Pattern ensures a class has only one instance, providing global access to that instance.
Key feature include
1. A private constructor
2. A private static instance
3. A static method for access
4. Lazy Initialization

```java
public class Singleton{
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

## Why use Singleton Pattern
1. Control access to a single instance
2. Global access to that instance
3. Manage shared resources efficiently
4. Prevent resource conflicts and inconsistent behavior
5. Provide a global configuration object
6. Ensure consistency and efficiency in managing shared resources

## Benefits
1. Single Instance
2. Global Access
3. Lazy Initialization
4. Resource Sharing
5. Centralized Control
6. Prevention of Duplicate Instances
7. Improved Testing
8. Consistent Interface

## Real-World Applications
1. Database Connection Pooling
2. Logging
3. Configuration Management
4. Caching
5. Print Spoolers
6. Device Drivers
7. Thread Pools

## How to Create a Singleton Design Pattern
1. Static Member
2. Private Constructor
3. Static Factory Method

## Thread Safety
- **Problem:** Basic implementation is not thread-safe
- **Solution:** Use synchronization mechanisms like synchronized keyword, double-checked locking, or Bill Pugh Singleton to ensure thread safety.

## Initialization Methods
- **Problem:** Eager Initialization - Instances created at class load or application start
- **Solution:** Lazy Initialization - Instance created only when first requested, improving performance

## Significance of Serialization
- **Problem:** Serialization can break Singleton pattern during deserialization.
- **Solution:** Implement `readResolve()` method to control the instance returned after deserialization.

## Drawbacks
1. Global State: Can introduce tight coupling; Use Dependency Injection to mitigate
2. Testing Challenges: Use Dependency Injection for easier testing
3. Singleton Pattern Violation: Implement measures to prevent violation.
4. Concurrency Issues: Address with thread safe mechanisms or ENUM implementation.

## Implementing Singleton

### Eager Initialization
- In this approach the object is initialized early at the time of object creation
- The object is created and initialized although it is not needed
- Used when singleton class is simple and not using a lot of resources.

```java
public class EagerInitialization{
    
    private static EagerInitialization INSTANCE = new EagerInitialization();
    private EagerInitialization(){
        
    }
    public static EagerInitialization getInstance(){
        return INSTANCE;
    }
}
```

### Singleton with the Static block
- Here, the object is created in static block, hence exception handling can be applied(which lacked in previous approach) while  object initialization.
- This approach also suffers the same problem as of Eager initialization as the object is created early though the application migh not be using it.

### Lazy Initialization
- Creates the object on demand
- Solution for Eager Initialization 
- Not thread safe

```java
public class LazyInit{
    private static LazyInit INSTANCE = null;
    
    private LazyInit(){
    }
    
    public static LazyInit getInstance(){
        if (Objects.isNull(INSTANCE)){
            synchronized (lazyInit.class){
                INSTANCE = new LazyInit();
            }
        }
        return INSTANCE;
    }
}
```

### Lazy Initialization - Thread Safe
- Added synchronization to handle multi-threaded scenarios
- Excessive synchronization reduces performance as each invocation needs to go through method level synchronization

```java
public class LazyInitialization{
    private static LazyInitialization INSTANCE = null;
    private LazyInitialization(){
    }
    
    public synchronized static LazyInitialization getInstance(){
        if (Objects.isNull(INSTANCE)){
            INSTANCE = new LazyInitialization();
        }
        return INSTANCE;
    }
}
```

### Lazy Intialization - Double Check
- Overcome the issues of method level synchronization
- Performs a double check of the object nullability
- This works, but it is also broken in multi-threaded scenarios.

```java
public class DoubleCheckSingleton{
    private static DoubleCheckSingleton INSTANCE;
    
    private DoubleCheckSingleton(){}
    
    public static DoubleCheckSingleton getInstance(){
        if(Objects.isNull(INSTANCE)){
            synchronized (DoubleCheckSingleton.class){
                if (Objects.isNull(INSTANCE)){
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
```

### Bill Pugh Singleton

```java
public class DoubleCheck{
    private static DoubleCheck INSTANCE;
    private DoubleCheck(){
    }
    public static DoubleCheck getInstance(){
        if (Objects.isNull(INSTANCE)){
            synchronized (DoubleCheck.class){
                if (Objects.isNull(INSTANCE)){
                    INSTANCE = new DoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
```

### Singleton with Single Instance Enum
- Create singleton with Java enum types 
- Provides native support to handle reflection, serialization and multithreaded scenarios
- enum types are somewhat inflexible

```java
public enum Singleton{
    INSTANCE;
}
```

### Safeguarding Singleton

**Make singleton safe from Reflection Access**
- **Reflection** is a process of examining or modifying the run-time behavior of a class at run time.
- Reflection enables you to inspect classes, interfaces, fields and methods as well as invoke methods dynamically.
- Private constructor can be accessed through the Java Reflection API
- Demo on how private constructor can be accessed through Java Reflection
```java
public class PrivateConstructorAccess{
    public static void main(String[] args){
        try {
            Class<?> myClass = MyClassWithPrivateConstructor.class;
            Constructor<?> privateConstructor = myClass.getDeclaredConstructor();
            privateConstructor.setAccessible(true);
            MyClassWithPrivateConstructor instance = (MyClassWithPrivateConstructor) privateConstructor.newInstance();
            instance.printMessage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class MyClassWithPrivateConstructor {
    // Private constructor
    private MyClassWithPrivateConstructor() {
        System.out.println("Private constructor invoked.");
    }

    public void printMessage() {
        System.out.println("Message from the instance of MyClassWithPrivateConstructor");
    }
}
```
- We use the getDeclaredConstructor method of the Class class to obtain the private constructor of the class with the private constructor.
- We then use the setAccessible(true) method on the Constructor object to make the private constructor accessible.
- Finally, we create an instance of the class using the newInstance method of the Constructor object
- Demo on how a singleton can be accessed through reflection
```java
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class SingletonWithReflection{
    public static void main(String[] args){
        EagerInitializedSingleton firstSingletonInstance = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton secondSingletonInstance = null;

        try{
            Class<EagerInitializedSingleton> clazz = EagerInitializedSingleton.class;
            Constructor<EagerInitializedSingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            secondSingletonInstance = constructor.newInstance();
        }catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e){
            e.printStackTrace();
        }
        System.out.println("Instance 1 hashcode: "+firstSingletonInstance.hashCode());
        System.out.println("Instance 2 hashcode: "+secondSingletonInstance.hashCode());
    }
}

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
    private EagerInitializedSingleton(){
    }
    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }
}
```
```text
Output
Instance 1 hashcode: 918221580
Instance 2 hashcode: 681842940
```

**Solution**
- Accessing singleton can be prevented by barring the access to constructor if the INSTANCE object is already initialized.
- Achieved by throwing an exception if the constructor is invoked after object initialization.

```java
import java.util.Objects;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        if (Objects.nonNull(INSTANCE)){
            throw new RuntimeException("This class can only be access through getInstance()");
        }
    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
```
### Make Singleton Safe from Serialization access
- We serialize an object to save the object state in a persistence store and later retrieve it.
- Process of saving the state is known as Serialization 
- Retrieve operation is called as Deserialization
- If a singleton is not implemented correctly, there are chances of having two instances of a singleton class
```java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

public class SingletonWithSerialization {
    public static void main(String[] args) {

        EagerInitializedSingleton firstSingletonInstance = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton secondSingletonInstance = null;

        ObjectOutputStream outputStream = null;
        ObjectInputStream inputStream = null;
        try{
            //Saving the object state in a file in file system
            outputStream = new ObjectOutputStream(new FileOutputStream("FirstSingletonInstance.ser"));
            outputStream.writeObject(firstSingletonInstance);
            outputStream.close();

            // Retrieving the object state from the file
            inputStream = new ObjectInputStream(new FileInputStream("FirstSingletonInstance.ser"));
            secondSingletonInstance = (EagerInitializedSingleton) inputStream.readObject();
            inputStream.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("FirstSingletonInstance hashcode: "+firstSingletonInstance.hashCode());
        System.out.println("SecondSingletonInstance hashcode: "+secondSingletonInstance.hashCode());
    }
}


public class EagerInitializedSingleton implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
    private EagerInitializedSingleton(){
        if (Objects.nonNull(INSTANCE)){
            throw new RuntimeException("This class can only be access through getInstance()");
        }
    }
    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }
}
```
```text
output
FirstSingletonInstance hashcode: 531885035
SecondSingletonInstance hashcode: 284720968
```
- This shows that there are two instances of singleton instance
```text
NOTE: Singleton class must implement the Serializable interface to be able to serialize the instance
```
- To prevent multiple instances through serialization, implement readResolve method in Singleton class.
- This method replaces the object read from the stream.

```java
import java.io.Serializable;
import java.util.Objects;

public class EagerInitializedSingleton implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
    private EagerInitializedSingleton(){
        if (Objects.nonNull(INSTANCE)){
            throw new RuntimeException("This class can only be access through getInstance()");
        }
    }
    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }
    protected Object readResolve(){
        return getInstance();
    }
}
```
```text
Output

```

## Java API examples designed with Singleton Pattern
1. `java.lang.Runtime#getRuntime()`
2. `java.awt.Desktop#getDesktop()`
3. `java.lang.System#getSecurityManager()`


