# Creational Design Patterns

- Aims to simplify the creation of objects in a object oriented system.
- Primary goal is make a system independent of how its objects are created, composed and represented.

Definition
- This type of Design patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.
- Objective of these patterns is to separate the system from how its objects are created, composed and represented.

Types Of Creational Design Patterns
1. [Singleton]()
2. [Factory Method]()
3. [Abstract Factory Pattern]()
4. [Builder]()
5. [Prototype]()
6. [Object Pool]()

Advantages
1. Flexibility: Provide more flexibility in deciding which objects need to be created for a given case.
2. Reusability: Promotoes reuse of existing code, reducing redundancy and errors.
3. Decoupling: Objects are created independently of the class implementations, leading to fewer dependencies and tighter encapsulation.

Applications
1. Singleton in Logging: A single logger instance is shared across a system.
2. Factory method in UI libraries: UI libs use this pattern to manage the creation of UI elements that can have different appearances and behaviors depending on the context.
3. Abstract Factory in Cross Platform Apps
4. Builder in Complex Object creation
5. Prototype in Object Cloning
