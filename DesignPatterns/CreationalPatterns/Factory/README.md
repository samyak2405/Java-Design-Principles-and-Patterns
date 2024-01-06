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
- Let's understand why we need Factory Design Pattern(FDP)

Example without FDP
```java

class Circle{
   void draw(){
      System.out.println("Drawing a circle");
   }
}

class Square{
   void draw(){
      System.out.println("Drawing a square");
   }
}

public class WithoutFactoryPattern {
   public static void main(String[] args) {
      Circle circle = new Circle();
      circle.draw();
      Square square = new Square();
      square.draw();
   }
}

```
- In above code, client code directly creates instances of concrete shapes using new operator
- In future if we need more shapes, the client code must be modified, potentially in multiple places.
- The client is tightly coupled to the specific shape classes.

Example with FDP
```java

interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}

class ShapeFactory{
    public Shape createShape(String shapeType){
        if("Circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        else if("Square".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("Circle");
        circle.draw();
        Shape square = shapeFactory.createShape("Square");
        square.draw();
    }
}
```
- In this example, Client code uses a ShapeFactory to create instances of shapes without knowing the concrete implementation details.
- Adding a new shape involves only modifying the factory code, keeping  the client code unchanged.
- Client is decoupled from the specific shape classes, promoting flexibility and easier maintenance.

### Implementation

#### 1. [Procedural Solution](https://github.com/samyak2405/Java-Design-Principles-and-Patterns/tree/main/DesignPatterns/CreationalPatterns/Factory/WithFactory)

#### 2. [Class Registration using Reflection](https://github.com/samyak2405/Java-Design-Principles-and-Patterns/tree/main/DesignPatterns/CreationalPatterns/Factory/ClassRegWithReflection)

#### 3. [Class Registration without Reflection](https://github.com/samyak2405/Java-Design-Principles-and-Patterns/tree/main/DesignPatterns/CreationalPatterns/Factory/ClassRegWithoutReflection)

#### 4. [Factory Method with Abstractions]()
