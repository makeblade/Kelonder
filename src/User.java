import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class User
{
    private String name;
    private int id;
    private String date;
    private Color color;
    private Set<Events> events;
    private String password;

    public User()
    {
        this.name = "";
        this.id = this.name.hashCode() + 1;
        this.date = new KDate().getCurrentDate();
        this.color = Color.WHITE;
        this.events = new HashSet<>();
        this.password = "";
    }
    public User(String name, String pass)
    {
        this.name = name;
        this.id = this.name.hashCode() + 1;
        this.date = new KDate().getCurrentDate();
        this.color = Color.WHITE;
        this.events = new HashSet<>();
        this.password = pass;
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

    public boolean removeEvent(String name){
        for(Events e : events)
            if(e.getTitle().equals(name))
                return events.remove(e);
        return false;
    }
    public boolean removeEvent(Event event){
        for(Events e : events)
            if(e.equals(event))
                return events.remove(e);
        return false;
    }

    public void clearEvents(){
        this.events.clear();
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

}
