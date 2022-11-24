# DataStructures
This Repository will have programs to understand Data structures in java with notes.

1. **Stack**:
   Stack is a LIFO Data structure
    - Store objects in to a sort of "vertical tower"
    - push and pop are methods to insert and remove elements.
    - Uses of stack:
        1. undo/redo features in text editor
        2. moving back/forward through browser history
        3. backtracking algo's (maze, file directories)
        4. calling functions


2. **Queue**:
   FIFO data structure eg. line of people
    - linear data structure
    - add/offer and remove/poll are two method of adding and removing elements.
    - adding elements is called enqueuing and removing is called dequeue'ing.
    - Queue is an interface and cannot be instantiated so create a LinkedList
    - Uses of queue:
       1. Keyboard buffer(letters should appear on the screen in order they are passed )
       2. Printer Queue
       3. Used in LinkedList, PriorityQueues, BFS.

3. **Priority Queues**:

    FIFO data structure that serves elements with the highest priorities first before elements with lower priority.
   

4. **LinkedList**:
   LinkedList vs Array/ArrayList:
      
      Array/ArrayList:
        
     - store elements in continuous memory location.
     - fantastic when accessing elements randomly but not efficient at inserting and deleting the elements   
      
      LinkedList: (singly)
      - long chain of nodes where node structure has data and next as its properties
      - non-continuous
      - no shifting of elements is required at the time of insertion and deletion.
      - searching elements takes time in LinkedList.
      - doubly LinkedList take more memory and can traverse both ways back and forth.
      - LinkedList can be used as stack by using push() and pop().             