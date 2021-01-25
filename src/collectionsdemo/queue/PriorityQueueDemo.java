package collectionsdemo.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        System.out.println(q.peek());
        //null
        //System.out.println(q.element());
        //exception

        for(int i=20;i<=30;i++){
            q.offer(i);
        }

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
        //for insertion it maintains the sorting order
        //after delete it donot
        //so that we need to implement comparator
    }
}
