import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;

public class kDate {

    private int year;
    private Month month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private String fullDate;
    private boolean restricted;

    public kDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.now();
        this.year = date.getYear();
        this.month = date.getMonth();
        this.day = date.getDayOfMonth();
        this.hour = date.getHour();
        this.minute = date.getMinute();
        this.second = date.getSecond();
        this.fullDate = dateFormat.format(date);
        restricted = true;
    }

}
