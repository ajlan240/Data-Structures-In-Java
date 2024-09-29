package LinkedList;

public class CircularLinkedList {
    Node head = null , tail = null;
    public void insertNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }


        tail = newNode;
        newNode.next = head;

    }
    public void insertBtw(int data, int nextTo) {
        
    }

    public void display()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("Linked List is Empty");
            return;
        }

        do {

            System.out.print(temp.data + " ");
            temp = temp.next;

        } while (temp != head);
            


        
    }
   class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
    
   }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertNode(4);
        list.insertNode(6);
        list.insertNode(9);
        list.insertNode(10);
        list.display();
    }
}
