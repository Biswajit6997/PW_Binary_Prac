// package ApnaColleg;

public class AddFirst {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;

    // Methods for create a node in a first
    public void Addfirst(int data) {
        // step1: Create a new node
        Node newNode = new Node(data);

        // check the ll is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2: -newNode next=head
        newNode.next = head;// link

        // step3: -head=newNode
        head = newNode;
    }

    // Method for addLast

    public void AddLast(int data) {
        // Step1: Create a new node
        Node newnode = new Node(data);
        // check
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step2.
        tail.next = newnode;
        // step3
        tail = newnode;

    }

    // implementation of Display linkedlist
    public void displayLL() {
        // if(head==null){
        // System.out.println("LL is empty ");
        // return;
        // }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    // Methods for insert at given posotion
    public void add(int idx, int data) {
        // addfirst
        if (idx == 0) {
            Addfirst(data);
            return;

        }

        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i=idx-1 ;temp->prev
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public static void main(String[] args) {

        AddFirst ll = new AddFirst();
        ll.Addfirst(2);
        // ll.displayLL();

        ll.Addfirst(1);
        // ll.displayLL();

        ll.Addfirst(4);
        // ll.displayLL();

        // ll.displayLL();
        ll.AddLast(10);
        // ll.displayLL();
        ll.AddLast(20);
        ll.displayLL();
        // after adding the add method--> insert at middle
        ll.add(2, 100);
        ll.displayLL();

    }
}
