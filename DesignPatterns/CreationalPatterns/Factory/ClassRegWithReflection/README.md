# Class Registration using Reflection

## Reflection Approach
- The `ProductFactory` class uses a `HashMap` to store the mapping between product IDs and their corresponding classes.
- The `registerProduct` method allows external code to register new product classes dynamically
- The `createProduct` method uses reflection to instantiate the product class based on the provided product ID

## Registration Examples
- Registration can be done outside the product classes by calling `registerProduct` on the factory instance
- Registration can be done inside the product classes using a static block. The `Class.forName` method ensures that the product classes are loaded and registered.

## Drawbacks
- Reflection may impact performance significantly.