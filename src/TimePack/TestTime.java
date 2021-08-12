package TimePack;

public class TestTime {

    public static void main(String[] args) {

        Time time = new Time(10,10,10);
        time.setTime(0,0,0);
        System.out.println(time);
        System.out.println(time.previousSecond());



    }
}
