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

    public void deleteNode(int value){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        while (current != null){
            if(current.data == value){
                if(current.previous == null){
                    head = current.next;
                } else{
                   current.previous.next = current.next;
                } if(current.next != null){
                    current.next.previous = current.previous;
                } return;
            } current = current.next;
        }

    }

}
