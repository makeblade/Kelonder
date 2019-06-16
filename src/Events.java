public class Events {

    String title;
    String description;
    int id;
    list<TimeInterval>;

    public Events(String title, String description)
    {
        this.title = title;
        this.description = description;
    }
    public Events(String title)
    {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
