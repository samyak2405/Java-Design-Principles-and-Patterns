# Dependency Inversion Principle

- High Level Modules(handling complex logic) should not depend on low-level modules(performing basic operations). Both should depend on abstractions
- Abstractions should not depend on details. Details should depend on abstractions.
- This inverts the conventional dependency relationship
- DIP minimizes coupling by introducing an abstraction layer, leading to code that is easier to modify and extend.
- Dependency injection, a key aspect of DIP, involves supplying external dependencies to a component and it can be implemented through constructor, method or property injection.
- According to this principle the way of designing a class structure is to start from high level modules to the low level modules
- High level classes ---> Abstraction Layer ---> Low Level Classes

## Benefits
1. Reduced Coupling: DIP reduces the direct dependencies between classes, leading to a more modular and maintainable codebase.
2. Code Reusability
3. Easier Testing

## Types of Dependency Injection
1. Constructor Injection
- can inject the dependency to the main component directly in the constructor when the component is instantiated.
- Dependency should be already instantiated when the constructor of the main component is invoked.

```java
public class UserService{
    private final Database database;
    
    public UserService(Database database){
        this.database = database;
    }
    
    public User getUser(int id){
        return database.query("SELECT * FROM users WHERE id="+id);
    }
}
```

2. Method Injection
- Rarely used.
```java
public class UserController{
    public User getUser(int id,UserService userService){
        return userService.getUser(id);
    }
    
    public static void main(String[] args){
        UserService userService = new UserService();
        UserController userController = new UserController();
        User user = userController.getUser(123,userService);
        //do something with the user
    }
}
```
3. Property Injection
- Passing the dependency through a property.
- Allows Lazy loading initialization of the dependency, in case the dependency is not instantiated when main component is instantiated.
- It makes the code less coupled, since the constructor of the main component does not have to know anything about the dependency.
```java
public class OrderService{
    private ProductService productService;
    
    public OrderService(){
        
    }
    public void setProductService(ProductService productService){
        this.productService = productService;
    }
}
```

## Example
- The Order class depends on the PaymentProcessor interface through its constructor.
- Concrete implementations (CreditCardPaymentProcessor and PayPalPaymentProcessor) are created independently
- Instances of the concrete implementations are injected into the Order class during its creation in the main method.

This follows DIP, as the High level Order class depends on an abstraction rather than concrete implementations.
It allows for easy substitution of payment processors without modifying the Order class, showcasing the flexibility and loose coupling achieved through DIP.

## Application of DIP
1. Testability and Mocking
- Improved Testability of your code.
- With high level modules depending on abstractions, it becomes much simpler to substitute real implementations with mock or stub objects during testing.
- Facilitates isolated unit testing, as you can easily create mock objects that simulate the behavior of the low-level modules, enabling through testing of your high level logic without relying on external systems or resources.

2. Inversion Of Control(IoC) Containers
- DIP aligns well with the concept of IoC.
- IoC containers are tools that manage the instantiation and wiring of objects in your application.
- By using IoC, you can centralize the configuration of your dependencies, making it easier to swap out implementations and manage the overall structure of your application.

3. Maintainability and Extensibility