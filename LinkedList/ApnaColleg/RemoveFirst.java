public class RemoveFirst {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // Correctly initialize the next reference
        }
    }

    public static Node head;
    public static Node tail;
    // calculate size
    public static int size;

    // Methods for create a node in a first
    public void AddFirst(int data) {
        // step1: Create a new node
        Node newNode = new Node(data);
        size++; // calculate the size

        // check if the linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2: -newNode next=head
        newNode.next = head; // link

        // step3: -head=newNode
        head = newNode;
    }

    // Method for addLast
    public void AddLast(int data) {
        // Step1: Create a new node
        Node newNode = new Node(data);
        size++; // calculate the size

        // check if the linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2: tail.next = newNode
        tail.next = newNode;
        // step3: tail = newNode
        tail = newNode;
    }

    // implementation of Display linked list
    public void displayLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    // Methods for insert at given position
    public void add(int idx, int data) {
        // addFirst
        if (idx == 0) {
            AddFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++; // calculate the size

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i=idx-1 ;temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at first
    public int removeFirst() {
        // special case:
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // case where the ll size is 1
            int val = head.data;
            head = tail = null;
            size = 0; // reset size
            return val;
        }
        int val = head.data;
        head = head.next;
        size--; // decrement the size
        return val;
    }

    // Delete at last
    public int removelast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0; // reset size
            return val;
        }

        // prev: i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--; // decrement the size
        return val;
    }

    public static void main(String[] args) {
        RemoveFirst ll = new RemoveFirst();
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddFirst(4);
        ll.AddLast(10);
        ll.AddLast(20);
        ll.add(2, 100);
        ll.displayLL(); // 4->1->100->2->10->20->null

        ll.removeFirst();
        ll.displayLL(); // 1->100->2->10->20->null

        ll.removelast();
        ll.displayLL(); // 1->100->2->10->null
        System.out.println(ll.size);
    }
}
