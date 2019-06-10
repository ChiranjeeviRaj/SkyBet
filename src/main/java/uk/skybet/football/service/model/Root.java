package uk.skybet.football.service.model;
import java.util.ArrayList;
import java.util.List;
public class Root
{
    private List<Events> events;

    public void setEvents(List<Events> events){
        this.events = events;
    }
    public List<Events> getEvents(){
        return this.events;
    }
}
