package uk.skybet.football.service.model;
public class Status
{
    private boolean active;

    private boolean started;

    private boolean live;

    private boolean resulted;

    private boolean finished;

    private boolean cashoutable;

    private boolean displayable;

    private boolean suspended;

    private boolean requestabet;

    public void setActive(boolean active){
        this.active = active;
    }
    public boolean getActive(){
        return this.active;
    }
    public void setStarted(boolean started){
        this.started = started;
    }
    public boolean getStarted(){
        return this.started;
    }
    public void setLive(boolean live){
        this.live = live;
    }
    public boolean getLive(){
        return this.live;
    }
    public void setResulted(boolean resulted){
        this.resulted = resulted;
    }
    public boolean getResulted(){
        return this.resulted;
    }
    public void setFinished(boolean finished){
        this.finished = finished;
    }
    public boolean getFinished(){
        return this.finished;
    }
    public void setCashoutable(boolean cashoutable){
        this.cashoutable = cashoutable;
    }
    public boolean getCashoutable(){
        return this.cashoutable;
    }
    public void setDisplayable(boolean displayable){
        this.displayable = displayable;
    }
    public boolean getDisplayable(){
        return this.displayable;
    }
    public void setSuspended(boolean suspended){
        this.suspended = suspended;
    }
    public boolean getSuspended(){
        return this.suspended;
    }
    public void setRequestabet(boolean requestabet){
        this.requestabet = requestabet;
    }
    public boolean getRequestabet(){
        return this.requestabet;
    }
}