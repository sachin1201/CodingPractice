package RectanglePack;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Rectangle's area is " + r1.getArea() + " and perimeter is " + r1.getPerimeter());
        r1.setLength(3.25f);
        r1.setWidth(5.2355f);
        System.out.println("Rectangle's length is " + r1.getLength() + " and width is " + r1.getWidth());
        System.out.println("Rectangle's area is " + r1.getArea() + " and perimeter is " + r1.getPerimeter());
        System.out.printf("area is: %.2f%n", r1.getArea());

        Rectangle r2 = new Rectangle(8,9);
        System.out.println(r2);
        System.out.println("Rectangle's length is " + r2.getLength() + " and width is " + r2.getWidth());
        System.out.println("Rectangle's area is " + r2.getArea() + " and perimeter is " + r2.getPerimeter());


    }
}
