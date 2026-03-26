
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void displayPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

class Circle {
    private double radius;
    private Point center; 

    
    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.center = new Point(x, y);
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public void displayCircle() {
        System.out.println("Radius: " + radius);
        center.displayPoint();
        System.out.println("Area: " + calculateArea());
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, 2.0, 3.0);
        c.displayCircle();
    }
}