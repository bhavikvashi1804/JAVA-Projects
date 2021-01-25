package collectionsdemo.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();

        //each method of List are applied to LinkedList


        for(int i=1;i<11;i++){
            list.add(i*10);
        }

        System.out.println(list);

        //lets see some specific methods of LinkedList
        LinkedList<Integer> linkedList = (LinkedList<Integer>)list;
        System.out.println(linkedList);

        System.out.println("First Element of Linked List is: "+ linkedList.getFirst());
        System.out.println("Last Element of Linked List is: "+ linkedList.getLast());

        System.out.println("Linked List is: "+linkedList);
        System.out.println("Add the Element at the starting of Linked List:");
        linkedList.addFirst(111);
        System.out.println("Linked list is: "+linkedList);
        System.out.println("Add the Element at end of Linked List:");
        linkedList.addLast(999);
        System.out.println("Linked list is: "+linkedList);


        System.out.println("Linked List is: "+linkedList);
        System.out.println("remove the 1st Element of Linked List:");
        linkedList.removeFirst();
        System.out.println("Linked list is: "+linkedList);
        System.out.println("remove the last Element of Linked List:");
        linkedList.removeLast();
        System.out.println("Linked list is: "+linkedList);

    }
}
