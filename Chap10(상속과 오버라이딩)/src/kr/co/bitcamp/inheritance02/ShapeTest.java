package kr.co.bitcamp.inheritance02;

public class ShapeTest {

    public static void main(String[] args) {
       
        //Circle test
        Circle circle = new Circle();
        circle.draw();
        System.out.println();
        
        Circle circle2 = new Circle(new Point(150, 150), 500);
        circle2.draw();
        System.out.println();
        
        //Triangle test
        Triangle triangle = new Triangle();
        triangle.draw();
        System.out.println();
        
        Point[] point = new Point[] {new Point(10,10), new Point(80,100), new Point(20,120)};
        Triangle triangle2 = new Triangle(point);
        triangle2.draw();

    }
}
