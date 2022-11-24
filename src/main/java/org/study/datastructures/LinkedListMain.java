package org.study.datastructures;

import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<String> linkedListAsStack = new LinkedList<>();

        linkedListAsStack.push("A");
        linkedListAsStack.push("B");
        linkedListAsStack.push("C");
        linkedListAsStack.push("D");
        linkedListAsStack.push("F");

        System.out.println(linkedListAsStack);
        System.out.println(linkedListAsStack.pop());

        LinkedList<String> linkedListAsQ = new LinkedList<>();

        linkedListAsQ.offer("A");
        linkedListAsQ.offer("B");
        linkedListAsQ.offer("C");
        linkedListAsQ.offer("D");
        linkedListAsQ.offer("F");

        System.out.println(linkedListAsQ);



    }
}
