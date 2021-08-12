package DatePack;

public class Date {

    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
//        String str[10] = new String();
        if(day < 10) {
            String sday = "0" + day;
            day = Integer.parseInt(sday);
            System.out.println(day);
        }
//        if(month < 10) {
//            String smonth = "0" + month;
//        }
        return "Set Date is " + day + "/" + month + "/" + year;
    }

}
