public class InsertAtEnd{

    Node head;
    
    class Node{
        int data;
        Node next;

        // constructor
        Node(int d){
            data=d;
            next=null;
        }
    }

    // Implemntation of insertion of a node at the end
    public void insertAtend(int newData){
        Node newNode=new Node(newData);

        // if linkedlist is empty
        if(head==null){
            head=new Node(newData);
            return;
        }
        // if linkedlist is not empty
        newNode.next=null;
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
            
        }
        temp.next=newNode;
        return;

    }

    // implementation of Display linkedlist
    public void displayLL(){
        Node current=head;
        while (current!=null) {
            System.out.print(current.data+ " ");
            current=current.next;
        }
    }


    public static void main(String[] args) {

        InsertAtEnd llist=new InsertAtEnd();
        llist.insertAtend(2);
        llist.insertAtend(4);
        llist.insertAtend(8);

        System.out.println("Before  adding the 10 linkedList is :");
        llist.displayLL();
        System.out.println();
        // insert data 10
        llist.insertAtend(10);


        System.out.println("After   adding the 10 linkedList is :");
        llist.displayLL();
        System.out.println();

        
    }
}