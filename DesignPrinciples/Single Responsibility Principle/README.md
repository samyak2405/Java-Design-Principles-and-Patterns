# Single Responsibility Principle

## What is Single Responsibility Principle

The Single Responsibility Principle(SRP) states that a class should have only one reason to change. 
In simpler words, it means that each class should have only one job or responsibility.
By doing so, your code becomes more modular, easier to understand and less prone to bugs

## Why is it important?
Imagine you have a toolbox and each tool has a specific purpose. If each tool does one thing well, you can easily grab the right tool for the job.
Similarly, in programming, if each class has a single responsibility, you can modify or replace that class without affecting the rest of your code.
This makes your software more adaptable and maintainable.

## Advantages of the SRP
1. **Easier Maintenance:** When a class has one responsibility, it's easier to find and fix issues.
You don't need to sift through unrelated code to make changes.
2. **Improved Readability:** Code becomes more readable and understandable. You can quickly grasp what a class does just by looking at its name and methods.
3. **Reusability:** Classes with a Single Responsibility are more likely to be reusable in other parts of your project or even in different projects.

## Example Inventory Management System

1. Product class: Focuses solely on representing product details. It doesn't handle inventory operations, keeping its responsibility clear and concise.
2. InventoryManager class: Handles inventory operations, ensuring that the inventory is updated correctly. It doesn't get involved in product details, following the SRP.
3. NotificationService class: Takes care of notifying about events like low stock. It doesn't deal with product details, stayin true to its single responsibility.

Reference
1. https://www.oodesign.com/single-responsibility-principle
