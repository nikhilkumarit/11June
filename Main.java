class Shape {
    public String color;

    public void display() {
        System.out.println("Shape color is " + color);
    }
}

class Circle extends Shape {
    double radius;

    public void area(double radius) {
        System.out.println("Area : " + (3.14 * radius * radius));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.color = "red";
        c1.display();
        c1.area(7);
    }
}