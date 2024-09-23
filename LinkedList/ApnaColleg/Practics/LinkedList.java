public class LinkedList {
    // To create a LinkedList
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
    public static int size;

    // Add First
    public void addFirst(int data) {
        // Step1: Create a new Node
        Node newNode = new Node(data);
        size++;// for calculate size of the LL
        // Check if LinkedList is empty or not
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step2: newnode next=head;
        newNode.next = head;
        // Step3: head=newNode
        head = newNode;

    }

    // Add Last
    public void addLast(int data) {
        // Step1:Create a new Node
        Node newNode = new Node(data);
        size++;// for calculate size of the LL
        if (head == null) {
            head = tail = null;
            return;

        }
        // Step2 : tail.next=newNode
        tail.next = newNode;
        // Step 3: tail=newNode
        tail = newNode;
    }

    // Print the LinkedList
    public void PrintLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("Null");
    }

    // Insert in middlle Position
    public void addMiddle(int idx, int data) {
        // Special Case
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnNode = new Node(data);
        size++;// for calculate size of the LL
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        newnNode.next = temp.next;
        temp.next = newnNode;
    }

    public int RemoveFirst() {
        // Spical CAse
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;// to calculate size
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove Last
    public int removeLast() {
        // Special case
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        // prev: i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;// decrement the size
        return val;

    }

    // Search In LL
    public int Itsearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;
    }
    // Search In LL : REcursive Approach
    public int RecSearch(int key){
        return helper(head,key);
    }
    public int helper(Node head,int key){
        if (head==null) {
            return -1;
            
        }
        if (head.data==key) {
            return 0;
            
        }
        int idx=helper(head.next, key);
        if (idx==-1) {
            return -1;
            
        }
        return idx+1;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.PrintLL();
        ll.addFirst(2);
        // ll.PrintLL();
        ll.addFirst(1);
        // ll.PrintLL();
        ll.addLast(4);
        ;
        // ll.PrintLL();
        ll.addLast(5);

        ll.addMiddle(2, 3);
        ll.PrintLL(); // 1->2->3->4->5->Null
        System.out.println(ll.size);// 5
        ll.RemoveFirst();
        ll.PrintLL();
        ll.removeLast();
        ll.PrintLL();
        System.out.println(ll.size);// 3
        
        // Iterative Search
        System.out.println(ll.Itsearch(4));// 2
        System.out.println(ll.Itsearch(10));// -1

        //Rccursive Search
        System.out.println(ll.RecSearch(4));//2
        System.out.println(ll.RecSearch(10));//-1

    }
}