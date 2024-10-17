public class CheckPallindromeLL {
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

    // Pallindrome Logic

    // Find mid --> Slow fast Approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null ) {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            
        }
        return slow;//Slow is my MidNode

    }
    public boolean checkPallindrome(){
        if(head==null|| head.next==null){

            return true;
        }
        // Find Middle
        Node mid=findMid(head);
        
        // Reverse 2nd Half

        Node curr=mid;
        Node prev=null;
        while (curr!=null) {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        Node right=prev;
        Node left=head;
        // Check if equal
        while (right!=null) {
            if (left.data!=right.data) {
                return false;
                
            }
            left=left.next;
            right=right.next;
        }
        return true;
        
    }



    public static void main(String[] args) {
        CheckPallindromeLL ll=new CheckPallindromeLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);

        // 
        ll.PrintLL();
        System.out.println(ll.checkPallindrome());

    }
}