

import java.awt.*;
import java.util.*;
import java.util.List;

public class Events {

    private String title;
    private String description;
    private int id;
    private List<TimeInterval> timeList;
    private Color color;

    public Events() { }
    public Events(String title, String description)
    {
        this.title = title;
        this.description = description;
        this.id = title.hashCode()+description.hashCode();
        timeList = new LinkedList<>();
    }
    public Events(String title)
    {
        this.title = title;
        this.description = "Empty";
        this.id = title.hashCode()+description.hashCode();
        timeList = new LinkedList<>();
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) {this.description = description; }
    public int getId(){return this.id;}



}
