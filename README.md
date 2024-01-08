# Double Linked List 

### Objective

In this project, our main goal will be to understand the fundamentals of a double linked list and its operations.

### Concepts

Use the provided resources for a better understanding.

|Concept|	Resources|
|-------|----------|
|Double linked list Java|[Insert and delete elements](https://www.youtube.com/watch?v=ZlNKNSz88Nk)|

### Problem

Create a `deleteNode` method to remove a specific value from a double linked list and `displayList` method to print all elements in the list.

### Implementation

write the implementation of the `deleteNode` method that removes a node with a specific value from the list.
```java
public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int data) {
        Node value = new Node(data);

        if (head == null) {
            head = value;
            tail = value;
        } else {
            tail.next = value;
            value.previous = tail;
            tail = value;
        }
    }
      
    /* your code here */

}
```
