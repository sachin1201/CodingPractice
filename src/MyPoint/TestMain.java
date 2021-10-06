package MyPoint;

public class TestMain {
    public static void main(String[] args) {

        MyPoint myPoint = new MyPoint(5,7);
        myPoint.setXY(2,2);
        MyPoint myPoint2 = new MyPoint(15,20);

        System.out.println(myPoint.getXY()[0] + "," + myPoint.getXY()[1]);
        System.out.println(myPoint.distance(myPoint2));

        MyPoint[] points = new MyPoint[10];
        for(int i=0; i<points.length;i++){
            points[i] = new MyPoint(i+1,i+1);
            System.out.println(points[i].distance(2,-2));

        }


    }
}
