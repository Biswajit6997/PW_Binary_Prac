public class ReverseLL {
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

    // Reverse the linked list
    public void Reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;  // Save the next node
            curr.next = prev;  // Reverse the current node's pointer
            prev = curr;       // Move prev to current node
            curr = next;       // Move current to the next node (which was saved earlier)
        }
        head = prev;  // Update the head to the last node, which is now the new head
    }

    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.PrintLL();  // Expected output: 1 2 3 4
        // Reverse the linked list
        ll.Reverse();
        ll.PrintLL();  // Expected output: 4 3 2 1
    }
}
