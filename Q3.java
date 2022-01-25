package com.daryl;
class Time {
    private long hour, minute;

    public Time () {
        hour = 12;
        minute = 0;
    }

    public void setHour(long h) {
        hour = h;
    }

    public long getHour() {
        return hour;
    }

    public void setMinute(long m) {
        minute = m;
    }

    public long getMinute() {
        return minute;
    }

    public void showTime() {
        System.out.println("Current time is: " + hour + ":" + minute);
    }
}
public class Q3 {
    public static void main(String[] args) {
        long totalMilliseconds=System.currentTimeMillis();
        System.out.println(totalMilliseconds);
        long totalSeconds= totalMilliseconds/1000;
        long modSeconds=totalSeconds%60;
        long totalMinutes=totalSeconds/60;
        long currentMinutes=totalMinutes%60;
        long totalHours=totalMinutes/60;
        long currentHour=totalHours%24;
        Time time1= new Time();
        time1.setHour(currentHour);
        time1.setMinute(currentMinutes);
        time1.showTime();
    }
}
