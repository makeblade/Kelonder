import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class KDate {


    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private String fullDate;
    private boolean modifyRestricted;

    public KDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.now();
        this.year = date.getYear();
        this.month = date.getMonth().getValue();
        this.day = date.getDayOfMonth();
        this.hour = date.getHour();
        this.minute = date.getMinute();
        this.second = date.getSecond();
        this.fullDate = dateFormat.format(date);
        modifyRestricted = true;
    }
    public KDate(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
        upDateCurrentDate();
        modifyRestricted = false;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(!modifyRestricted)
            this.year = year;
        upDateCurrentDate();
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(!modifyRestricted)
            this.month = month;
        upDateCurrentDate();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(!modifyRestricted)
            this.day = day;
        upDateCurrentDate();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(!modifyRestricted)
            this.hour = hour;
        upDateCurrentDate();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(!modifyRestricted)
            this.minute = minute;
        upDateCurrentDate();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(!modifyRestricted)
            this.second = second;
        upDateCurrentDate();
    }

    public void upDateCurrentDate()
    {
        fullDate = this.year + "/" + (month>9 ? month : "0"+ month) ;
        fullDate += "/";
        fullDate += (day > 9 ? day : "0"+ day);
        fullDate += "/ ";
        fullDate += (hour>9 ? hour : "0"+ hour);
        fullDate += "/";
        fullDate += (minute>9 ? minute: "0"+ minute);
        fullDate += "/";
        fullDate += (second>9 ? second: "0"+ second);
    }

    public String getCurrentDate()
    {
        return fullDate;
    }

    @Override
    public String toString()
    {
        return this.fullDate;
    }

}
