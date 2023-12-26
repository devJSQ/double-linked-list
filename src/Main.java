public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.displayList();
        
        /* call the method */
    }
}

public class Node {
    public int data;
    public Node previous;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(int data) {
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

    public void displayList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    /* your code here */

}
