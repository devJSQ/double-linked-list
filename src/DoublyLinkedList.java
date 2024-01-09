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
