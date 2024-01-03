# Liskov's Substitution Principle

## Intent
- Derived types must be completely substitutable for their base types.
- This Principle states that if a program module is using a Base class, then the reference to the Base class can be replaced with a Derived class without affecting the functionality of the program module.
- Promotes the idea of substitutability among objects of a base class and its derived classes.
- This principles ensures that objects of derived classes can be used interchangeably with objects of the base class without 
affecting the correctness of the program.
- In simple terms, If a class S is a subclass of class T, an object of type T should be replaceable with an object of type S without altering the desirable properties of the program.

## Benefits
1. Code Reusability: LSP encourages the reuse of existing code by allowing derived classes to be used interchangeably with their base class
2. Flexibility: Systems designed with LSP are more flexible and can easily accomodate changes without affecting existing code.
3. Maintainability: LSP improves code maintainability by minimizing the impact of modifications on the existing codebase.
4. Readability: Code that adheres to LSP is generally more readable and comprehensible.

## Where to use it?
- Designing class hierarchies
- Implementing polymorphism
- Creating interfaces.
- Important when working with frameworks and libraries where different components needs to interact seamlessly.

## Example 1 (LSP_1)
- In this example, we have a base class Rectangle and a derived class Square.
- The AreaCalculator class calculates the area of any shapes derived from the Rectangle class.
- The code follows LSP because Square class, despite having different implementation for setting width and height, can be seamlessly substituted for a Rectangle without affecting the correctness of the area calculation.

## Example 2 (LSP_2)
- In this example, we have a base class Discount and two derived classes, PercentageDiscount and FixedAmountDiscount
- Product class applies discounts to its price using a Discount object.
- Code follows LSP as both types of discounts can be applied interchangeably without affecting the behavior of the Product class
