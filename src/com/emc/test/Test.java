package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

    public static void main(String[] args) {
        Organizer organizer = new Organizer();



        Event event = new Event();
        event.setId(456l);
        event.setName("iPhone 13 Launch");
        event.setDescription("Grand Launch");


        System.out.println(event.getId());
        System.out.println(event.getName());
        System.out.println(event.getDescription());




    }
}
