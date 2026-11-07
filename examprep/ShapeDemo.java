import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

interface Drawable {
    void draw();
}

abstract class Shape implements Drawable, Comparable<Shape> {
    String name;

    Shape(String name) {
        this.name = name;
    }

    abstract double area();

    public int compareTo(Shape other) {
        return Double.compare(this.area(), other.area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println(name + " is a circle, area = " + area());
    }
}

class Square extends Shape {
    double side;

    Square(String name, double side) {
        super(name);
        this.side = side;
    }

    double area() {
        return side * side;
    }

    public void draw() {
        System.out.println(name + " is a square, area = " + area());
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("C1", 3));
        shapes.add(new Square("S1", 4));
        shapes.add(new Circle("C2", 1));

        Collections.sort(shapes);

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("shapes.txt", true));
            for (Shape s : shapes) {
                s.draw();
                out.println(s.name + " area=" + s.area());
            }
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open the file");
        } finally {
            System.out.println("Done writing shapes");
        }
    }
}
