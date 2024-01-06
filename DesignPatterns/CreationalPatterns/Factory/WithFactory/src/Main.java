
interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}

class ShapeFactory{
    public Shape createShape(String shapeType){
        if("Circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        else if("Square".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("Circle");
        circle.draw();
        Shape square = shapeFactory.createShape("Square");
        square.draw();
    }
}