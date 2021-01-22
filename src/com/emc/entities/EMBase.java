package com.emc.entities;

public class EMBase {

    protected long id;
    protected String name;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public  EMBase(){

    }

    public  EMBase(long id,String name){
        this.id = id;
        this.name = name;
    }
}
