# 1. Procedural Solution
- Also known as parameterized factories
- Generating method can be written so that it can generate more types of Product objects
- Using condition to identify the type of object that should be created

- **Problem**
    - Once we add a new concrete product call we should modify the Factory class.
    - Not flexible
    - Violates OCP