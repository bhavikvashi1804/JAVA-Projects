package com.emc.entities;

public class Participant  extends EMBase{

    private String email;
    private boolean checkedIn;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getCheckedIn(){
        return  checkedIn;
    }

    public  void setCheckedIn(boolean x){
        this.checkedIn = x;
    }

    public  Participant(){

    }

    public  Participant(long id, String name,String email, boolean checkedIn){
        super(id,name);
        this.email = email;
        this.checkedIn = checkedIn;
    }
}
