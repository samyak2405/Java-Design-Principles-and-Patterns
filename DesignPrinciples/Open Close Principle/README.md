# Open Close Principle(OCP)
 
OCP was proposed by Bertrand Meyer

It Emphasizes that a class should be open for extension but closed for modification.
This principle encourages a design that allows new functionality to be added without altering existing code, promoting 
flexibility and maintainability in software system.

## Why do we need the OCP
- In software development change is inevitable.
- As systems envolve, requirements may change and new features may need to be added.
- The OCP addresses the challenges of managing these changes without disrupting the existing functionality.
- By designing classes that are open for extension, we can introduce new features by extending existing code rather than modifying it.
- This reduces the risk of introducing bugs in well-established code and streamlines the development process.

## where is the Open-Closed Principles applied?
1. Framework and Library Design: Applying OCP allows developers to extend these frameworks with custom functionality without modifying thier core code.
2. Plugins Systems: New plugins can be added to core system without altering it, allowing easy customization and expansion.
3. Feature Development: Following the OCP enables developers to add new behavior without changing the existing codebase, reducing the risk of introducing bugs.
4. Third-Party Integration

## Benefits of the OCP
1. Code Stability: Existing code remains stable, reducing the likelihood of introducing bugs when new features are added.
2. Ease of Maintenance: Code that follows the OCP is generally easier to maintain.
3. Reduced Regression: With closed classes, there is less risk of unintentional changes affecting the behavior of existing code.
4. Promotes Code Resusability: Open classes can be reused in various contexts without modifications, fostering code reusability.

## Example(In the given code)
1. Customer interface: Defines a common contract for calculating discounts.
2. RegularCustomer and GoldCustomer implements Customer Interface, each providing its own discount calculation logic.
3. The Order class utilizes the Customer interface, allowing the introduction of new customer types without modifying the Order class.
4. The OrderProcessor class processes orders without being concerned about specific customer implementations.

- This design adheres to the OCP.
- New Customer types can be introduced without modifying existing code, providing a scalable and flexible solution.