/**
    The Circle class represents a geometric circle and extends the abstract
    GeometricObject class.

    - Stores a radius value, provides methods to compute
    the circle's area and perimeter, and supports comparison between Circle
    objects based on their radii by implementing the Comparable interface.

    Also overrides the equals method to determine equality based on
    radius, and provides multiple constructors to create Circle objects with
    optional color and filled properties inherited from GeometricObject.
 */

public class Circle extends GeometricObject implements Comparable<Circle> {

    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with radius, color, and weight (same pattern used in GeometricObject)
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement abstract methods from GeometricObject
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Implement Comparable interface
    @Override
    public int compareTo(Circle o) {
        // Compare by radius
        if (this.radius < o.radius)
            return -1;
        else if (this.radius > o.radius)
            return 1;
        else
            return 0;
    }

    // Override equals from Object class
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle)o;
            return this.radius == c.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle(radius = " + radius + ")";
    }
}
