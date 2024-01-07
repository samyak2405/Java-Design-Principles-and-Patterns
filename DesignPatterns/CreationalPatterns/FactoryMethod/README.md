# Factory Method Pattern

- Also known as Virtual Constructor
- Related to the idea on which libraries work
- A library uses abstract classes for defining and maintaining relations between objects.
- The Factory Method pattern provides an interface for creating objects
- The Factory Method Pattern lets subclasses decide what concrete class to instantiate and this decision is made by implementing a method declared in the superclass.
- The exact type of object is determined by subclasses at runtime.

## Intent
- Defines an interface for creating objects, but let subclasses to decide which class to instantiate
- Refers to the newly created object through a common interface

## Where to use
- When a class can't anticipate the type of the objects it is supposed to create
- When a class wants its subclasses to be the ones to specific the type of a newly created object.
- Commonly used in Library or Framework Design
- Creating objects with Complex Initialization

## Why we use it?
- Decoupling: Helps to decouple the client code from the actual implementation of the object.
- Flexibility: Allows easy extension by letting subclasses provide an implementation for creating objects  without modifying the client code.

## Difference between Factory Pattern and Factory Method Pattern
- In Factory Pattern, a factory class is responsible for creating objects
- In Factory Method Pattern, the creation of objects is delegated to subclasses by providing an interface(method) that subclasses implement.

## Example
1. [Without Factory Method Pattern]()
- The client code directly decides which type of `Vehicle` to instantiate(Car or Motorcycle)
- If you need to change the type of vehicle or add more types you have to modify the client code, which lead to maintenance issues and violates the OCP.

2. [With Factory Method Pattern]()
- Client code is decoupled from the specific types of vehicles.
- It depends on the `VehicleFactory` interface instead of concrete classes.
- Adding a new type of vehicle is easier. You can create a new class implementing `VehicleFactory` and the client code remains unchanged.
- Factory method Pattern adheres to the OCP, allowing for extension without modification.

3. [Notification Service]()
- Factory class `NotificationFactory` with a method `createNotification` which is responsible for creating instances of the interface based on a provided parameter.
- Encapsulates the object creation logic within the factory class, allowing the client code to create objects without specifying their concrete classes explicitly.