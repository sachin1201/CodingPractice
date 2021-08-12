package CirclePack;

public class TestCircle {
    public static void main(String[] args){

        // Declare an instance of Circle class called c1.
        Circle c1 = new Circle();

        // invoke public method on instance c1, via dot operator.
        System.out.println("The Circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        // Declare an instance of Circle class called c2.
        Circle c2 = new Circle(2);

        // invoke public method on instance c2, via dot operator.
        System.out.println("The Circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        c2.setRadius(10);
        System.out.println("The Circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(3, "purple");

        // invoke public method on instance c3, via dot operator.
        System.out.println("The Circle has radius of " + c3.getRadius() + ", area of " + c3.getArea() + " and color of " + c3.getColor());
        c3.setRadius(15);
        c3.setColor("Yellow");
        System.out.println("The Circle has radius of " + c3.getRadius() + ", area of " + c3.getArea() + " and color of " + c3.getColor());

        System.out.println(""+c3);


    }

}
