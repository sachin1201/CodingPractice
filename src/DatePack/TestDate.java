package DatePack;

public class TestDate {

    public static void main(String[] args) {

        Date dt = new Date(05,9, 1990);
        System.out.println("Date is " + dt.getDay() + "/" + dt.getMonth() + "/" + dt.getYear());
        dt.setDay(5);
        dt.setMonth(1);
        dt.setYear(1999);
        System.out.println(dt);





    }


}
