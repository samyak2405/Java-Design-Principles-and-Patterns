
class Circle{
    void draw(){
        System.out.println("Drawing a circle");
    }
}

class Square{
    void draw(){
        System.out.println("Drawing a square");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        Square square = new Square();
        square.draw();
    }
}