import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

public class User
{
    private String name;
    private int id;
    private String date;
    private Color color;
    private LinkedList<Events> events;
    private String password;

    public User()
    {
        this.name = "";
        this.id = this.name.hashCode() + 1;
        this.date = new KDate().getCurrentDate();
        this.color = Color.WHITE;
        this.events = null;
        this.password = "";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public void addEvents(Events event)
    {
        this.events.add(event);
    }

    public void clearEvents(){
        this.events.clear();
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
