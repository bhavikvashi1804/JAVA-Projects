package com.emc.entities;

public class Venue  extends  EMBase{

    public String description;
    public String streetAddress;
    public String city;
    public String state;
    public String pinCode;

    public  Venue(){

    }

    public  Venue(long id,String name,String description,String streetAddress,String city,String state, String pinCode){
        super(id, name);
        this.description = description;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }
}
