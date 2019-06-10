package uk.skybet.football.service.model;
import java.util.List;
public class Events
{
    private int eventId;

    private String name;

    private int displayOrder;

    private String sort;

    private int linkedEventId;

    private int classId;

    private String className;

    private int typeId;

    private String typeName;

    private int linkedEventTypeId;

    private String linkedEventTypeName;

    private String startTime;

    private Scores scores;

    private List<Competitors> competitors;

    private Status status;

    private int boostCount;

    private int superBoostCount;

    private List<Long> markets;

    public void setEventId(int eventId){
        this.eventId = eventId;
    }
    public int getEventId(){
        return this.eventId;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDisplayOrder(int displayOrder){
        this.displayOrder = displayOrder;
    }
    public int getDisplayOrder(){
        return this.displayOrder;
    }
    public void setSort(String sort){
        this.sort = sort;
    }
    public String getSort(){
        return this.sort;
    }
    public void setLinkedEventId(int linkedEventId){
        this.linkedEventId = linkedEventId;
    }
    public int getLinkedEventId(){
        return this.linkedEventId;
    }
    public void setClassId(int classId){
        this.classId = classId;
    }
    public int getClassId(){
        return this.classId;
    }
    public void setClassName(String className){
        this.className = className;
    }
    public String getClassName(){
        return this.className;
    }
    public void setTypeId(int typeId){
        this.typeId = typeId;
    }
    public int getTypeId(){
        return this.typeId;
    }
    public void setTypeName(String typeName){
        this.typeName = typeName;
    }
    public String getTypeName(){
        return this.typeName;
    }
    public void setLinkedEventTypeId(int linkedEventTypeId){
        this.linkedEventTypeId = linkedEventTypeId;
    }
    public int getLinkedEventTypeId(){
        return this.linkedEventTypeId;
    }
    public void setLinkedEventTypeName(String linkedEventTypeName){
        this.linkedEventTypeName = linkedEventTypeName;
    }
    public String getLinkedEventTypeName(){
        return this.linkedEventTypeName;
    }
    public void setStartTime(String startTime){
        this.startTime = startTime;
    }
    public String getStartTime(){
        return this.startTime;
    }
    public void setScores(Scores scores){
        this.scores = scores;
    }
    public Scores getScores(){
        return this.scores;
    }
    public void setCompetitors(List<Competitors> competitors){
        this.competitors = competitors;
    }
    public List<Competitors> getCompetitors(){
        return this.competitors;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public Status getStatus(){
        return this.status;
    }
    public void setBoostCount(int boostCount){
        this.boostCount = boostCount;
    }
    public int getBoostCount(){
        return this.boostCount;
    }
    public void setSuperBoostCount(int superBoostCount){
        this.superBoostCount = superBoostCount;
    }
    public int getSuperBoostCount(){
        return this.superBoostCount;
    }
    public void setMarkets(List<Long> markets){
        this.markets = markets;
    }
    public List<Long> getMarkets(){
        return this.markets;
    }
}
