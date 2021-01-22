package com.emc.entities;

public class Event extends EMBase{

    private String description;
    private String startTime;
    private String endTime;
    private boolean started;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public boolean getStarted(){
        return  started;
    }

    public  void  setStarted(boolean started1){
        this.started = started1;
    }



    public  Event(){

    }

    public Event(long id,String name,String description){
        super(id,name);
        this.description = description;

    }
}
