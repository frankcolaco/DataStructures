package org.study.datastructures;

import java.util.Stack;
/*
Stack is a LIFO ata structure
    - stores objects in to a sort of "vertical tower"
    - push and pop are methods to insert and remove elements.
    - Uses of stack:
        1. undo/redo features in text editor
        2. moving back/forward through browser history
        3. backtracking algo's (maze, file directories)
        4. calling functions
 */
public class StackMain {

    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();
        stack.push("CS");
        stack.push("Dota");
        stack.push("RoadRash");
        System.out.println(stack.empty());
        String myFavGame=stack.pop();// removes the element
        System.out.println(stack);
        System.out.println(myFavGame);
        System.out.println(stack.peek()); // top element
        System.out.println(stack.search("RoadRash")); // searches the elements in stack and returns -1 i element is not present

    }


}
