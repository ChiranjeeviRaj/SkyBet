package uk.skybet.football.service.model;
public class Scores
{
    private int home;

    private int away;

    public void setHome(int home){
        this.home = home;
    }
    public int getHome(){
        return this.home;
    }
    public void setAway(int away){
        this.away = away;
    }
    public int getAway(){
        return this.away;
    }
}