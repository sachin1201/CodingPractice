package TimePack;

public class Time {

    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String nextSecond() {
        if(this.second < 59) {
            this.second = this.second + 1;
        } else {
            this.second = 00;
            if (this.minute < 59){
                this.minute = this.minute + 1;
            } else {
                this.minute = 00;
                if (this.hour < 23) {
                    this.hour = this.hour + 1;
                }else {
                    this.hour = 00;
                }
            }
        }
        return "Time is " + hour + ":" + minute + ":" + second;
    }

    public String previousSecond() {
        if(this.second > 0) {
            this.second = this.second - 1;
        } else {
            this.second = 59;
            if (this.minute > 0){
                this.minute = this.minute - 1;
            } else {
                this.minute = 59;
                if (this.hour > 0) {
                    this.hour = this.hour - 1;
                }else {
                    this.hour = 23;
                }
            }
        }
        return "Time is " + hour + ":" + minute + ":" + second;
    }



    public String toString() {
        return "Time is " + hour + ":" + minute + ":" + second;
    }

}
