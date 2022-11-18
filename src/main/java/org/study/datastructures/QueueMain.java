package org.study.datastructures;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue: FIFO data structure eg. line of people
 *         linear data structure
 *         add/offer and remove/poll are two method of adding and removing elements.
 *         adding elements is called enqueuing and removing is called dequeue'ing.
 *         Queue is an interface and cannot be instantiated so create a LinkedList
 */
public class QueueMain {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Alisha");
        queue.offer("Deborah");
        queue.offer("Frank");

        System.out.println(queue);
        System.out.println(queue.peek()); // head of queue
       // System.out.println(queue.poll()); // remove element
       // System.out.println(queue.element()); //not recommended to use
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("Frank"));
    }
}
