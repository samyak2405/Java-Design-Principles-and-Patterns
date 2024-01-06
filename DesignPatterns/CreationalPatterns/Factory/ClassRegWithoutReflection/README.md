# Class Registration without Reflection

## Avoiding Reflection
- To avoid reflection, the creation of objects is moved outside the factory to the concrete product classes
- Each Concrete product class implements an abstract method `createProduct` to create instance of itself
- The `registerProduct` method now registers concrete product instances rather than class types.

# INCOMPLETE