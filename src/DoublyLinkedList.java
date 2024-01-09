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
     public void displayList() {
        Node current = head;

        System.out.println("Elements in the list:");

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    /* your code here */

}
