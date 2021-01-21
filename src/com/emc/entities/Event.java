package com.emc.entities;

public class Event extends EMBase{

    public String description;
    public String startTime;
    public String endTime;
    public  boolean started;

    public  Event(){

    }

    public Event(long id,String name,String description){
        super(id,name);
        this.description = description;

    }
}
