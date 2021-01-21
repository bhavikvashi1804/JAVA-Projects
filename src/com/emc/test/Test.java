package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        organizer.id = 123l;
        organizer.name = "Apple Inc";
        System.out.println(organizer.id);
        System.out.println(organizer.name);


        Event event = new Event();
        event.id = 456l;
        event.name = "iPhone 13 Launch";
        event.description = "Grand Launch";
        System.out.println(event.id);
        System.out.println(event.name);
        System.out.println(event.description);

        Event event1 = new Event(789l,"iPhone 14 Launch","Grand Launch");
        System.out.println(event1.id);
        System.out.println(event1.name);
        System.out.println(event1.description);


    }
}
