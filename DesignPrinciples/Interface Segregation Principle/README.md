# Interface Segregation Principle(ISP)

- **Clients should not be forced to depend upon interfaces that they don't use.**
- Emphasizes the importance of keeping interfaces slim and relevant to the clients that implement them.

- This principle focuses on creating specific and smaller interfaces rather than having a large, all-encompassing one.
- The idea is to avoid forcing classes to implement interfaces they do not use.

## Why use ISP?
- By breaking down interfaces into smaller, specialized parts, we ensure that classes only need to implement the methods relevant to them
- This leads to cleaner code, reduces dependencies and makes it easier to extend or modify the system without affecting unrelated parts.

## Benefits of ISP
1. Modularity: Interfaces become modular, allowing developers to choose and implement only the methods required for a particular class.
2. Reduced Dependencies: Classes are not burdened with unnecessary methods, minimizing the chances of unintended side effects or changes when modifying unrelated parts of the system.
3. Easier Maintenance: Code becomes more maintainable as changes to one part of the system are less likely to impact other parts, thanks to the specific interfaces.

## Where do We use ISP?
- ISP is particularly useful in systems where different classes share some common functionality but not all of it.
Ex: Consider a system dealing with different types of products, each having distinct characteristics.

## Understanding the Example Code
- **Smaller Interfaces:** Instead of having a single, monolithic "Product" interface, we have smaller interfaces for physical, digital and subscription-based products
- **Specific Implementations:** Each product class only implements the interfaces relevant to its type.
For ex: A Book class implements the PhysicalProduct interface with methods related to Physical Products.
- **Usage Example:** The printProductDetails method demonstrates how different product details can be printed without unnecessary checks. Each product is treated based on its specific interface, promoting a clean and efficient approach.
