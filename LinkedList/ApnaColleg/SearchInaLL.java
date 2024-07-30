public class SearchInaLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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

    // implementation of Display linked list
    public void displayLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    // ******************************************************************************
    // Iterative Search
    public int itrSearch(int key) {// t(n)=O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;

        }

        // l=key is not found
        return -1;
    }

    // Recursive Search // --O(n) 

    public int helper(Node head, int key) {

        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int RecSearch(int key) {
        return helper(head, key);

    }

    public static void main(String[] args) {
        SearchInaLL ll = new SearchInaLL();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.displayLL();// 5->4->3->2->1->null
        // System.out.println("Key found at idx " + ll.itrSearch(4));
        // System.out.println("Key found at idx " + ll.itrSearch(5));// -1
        System.out.println("Key found at idx " + ll.RecSearch(4));
        System.out.println("Key found at idx " + ll.RecSearch(5));

    }

}
