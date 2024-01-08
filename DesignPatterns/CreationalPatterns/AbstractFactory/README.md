# Abstract Factory Pattern

- Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- Also referred to as a `Factory of Factories` as it deals with multiple related factory methods.

# Why do we use it?
1. **Abstraction:** It promotes loose coupling between client code and concrete classes by allowing a client to use an interface for creating families of objects. This enhances flexibility and maintainability.
2. **Encapsulation** The details of object creation are encapsulated within the factory, making it easy to change the underlying implementation without affecting the client code.

# Where do we use it?
1. A system must be independent of how its objects are created, composed and represented.
2. A system is configured with multiple families of objects.
3. The family of related objects must be used together and the system needs to be unaware of their concrete classes.

# Real-World Application
1. GUI Libraries
2. Database Libraries
3. Cross-platform application

# Example
- In the given example, The CarFactory is calling USACarFactory, IndiaCarFactory and DefaultCarFactory which intern are responsible for creating MiniCar, MicroCar and LuxuryCar
