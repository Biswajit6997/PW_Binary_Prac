public class RemoveCycle {
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

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
            if (slow == fast) {
                return true;// cycle exist

            }

        }
        return false;// cycle doesnot exist
    }

    static void removeCycle() {
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) { // cycle detected
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return; // No cycle, no need to remove
        }

        // Find the starting point of the cycle
        slow = head;
        Node prev = null;

        if (slow == fast) {
            // Special case when cycle starts from the head
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow != fast) {
                prev = fast; // prev will keep track of the node just before fast
                slow = slow.next;
                fast = fast.next;
            }
        }

        // Remove the cycle by setting the next of the last node in the cycle to null
        fast.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = head;
        // 1->2->3->2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }
}
