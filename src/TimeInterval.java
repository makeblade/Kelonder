import java.util.Date;

public class TimeInterval {
    private KDate start;
    private KDate end;

    public KDate  getStart() {
        return start;
    }

    public void setStart(int year, int month, int day, int hour, int minute) {
        this.start = new KDate(year, month, day, hour, minute);
    }

    public KDate getEnd() {
        return end;
    }

    public void setEnd(int year, int month, int day, int hour, int minute) {
        this.end = new KDate(year, month, day, hour, minute);
    }


}
