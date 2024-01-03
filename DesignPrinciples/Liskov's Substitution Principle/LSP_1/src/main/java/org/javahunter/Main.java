package org.javahunter;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,5);
        Square square = new Square(10);

        System.out.println("Rectangle Area: "+AreaCalculator.calculateArea(rectangle));
        System.out.println("Square Area: "+AreaCalculator.calculateArea(square));

        square.setWidth(8);
        System.out.println("Modified Square Area: "+AreaCalculator.calculateArea(square));
    }
}