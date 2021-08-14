package CirclePack;

public class Circle {  //save as Circle.java

    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // constructors (overloaded)
    /** constructs a circle instance with default value for radius and color */
    public Circle() {  // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** constructs a circle instance with given value for radius and color */
    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** sets the new radius */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /** Returns the area of this circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Circle's radius: " + radius + " and color: " + color;
    }

}
