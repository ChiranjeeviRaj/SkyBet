package uk.skybet.football.service.model;
public class Competitors
{
    private String name;
    private String position;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return this.position;
    }
}