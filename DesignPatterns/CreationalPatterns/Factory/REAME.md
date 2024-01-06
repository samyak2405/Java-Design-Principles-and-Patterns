# Factory Pattern

- Provides an interface for creating objects in a super class but allows subclasses to alter the type of objects that will be created.

### What is Factory Design Pattern?
- Creates objects without exposing the instantiation logic to the client
- refers to the newly created object through a common interface.

### Why we use Factory Design Pattern?
1. **Encapsulation**
    - Encapsulates the object creation code
    - Provides a clear separation between object creation and rest of the application.
2. **Flexibility**
    - Allows the client code to use an interface for object creation
    - Actual implementation can be changed without affecting the client code

### Where we use Factory Design Pattern?
- Used in scenarios where a class cannot anticipate the class of objects it needs to create.
- Used when the system is configured with multiple families of objects, and client code needs to be independent of the classes it creates.

### Benefits
- Code reusability
- Promotes loose coupling between client code and objects being created.
- Provides a central point of control for object creation, making it easier to manage

### Drawbacks
1. Problem: Can introduce a large number of factory classes, especially in complex systems, which may lead to code duplication.
    - Solution: Use the Abstract Factory Pattern if you need to deal with families of related or dependent objects. This helps in avoiding a proliferation of factory classes.
2. Problem: If a new type of object needs to be added, it may require modifying the existing factory classes.
    - Solution: Consider combining the Factory Pattern with other design patterns to address specific concerns in your application. 

### Example

```java

```
