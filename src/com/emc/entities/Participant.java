package com.emc.entities;

public class Participant  extends EMBase{

    public String email;
    public boolean checkedIn;

    public  Participant(){

    }

    public  Participant(long id, String name,String email, boolean checkedIn){
        super(id,name);
        this.email = email;
        this.checkedIn = checkedIn;
    }
}
