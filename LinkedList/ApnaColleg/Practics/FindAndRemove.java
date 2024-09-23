public class FindAndRemove {
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

    // Add a node at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);  // Create a new node with given data
        if (head == null) {  // If the list is empty
            head = tail = newNode;  // Both head and tail should point to the new node
            return;
        }
        newNode.next = head;  // Point new node to the current head
        head = newNode;  // Move the head to the new node
    }

    // Print the linked list
    public void PrintLL() {
        Node temp = head;  // Start from the head
        while (temp != null) {  // Traverse until the end
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // DeleteFroNthNode
    public void DeleteFroNthNode(int n){
        // Calculate Size
        int sz=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            sz++;
            
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while (i<iToFind) {
            prev=prev.next;
            i++;
            
        }
        prev.next=prev.next.next;
        return;
    }

   


    public static void main(String[] args) {
        FindAndRemove  ll = new FindAndRemove();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.PrintLL();
        ll.DeleteFroNthNode(3);
        ll.PrintLL();



    }
}
