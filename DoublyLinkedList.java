package LinkedList;
public class DoublyLinkedList {

    public Node head = null;
    public Node tail = null;
    
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail; 
        }

        tail = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
            
        }
    }
    public void displayBack() {
        if (tail == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }        
    } 
    public void addBtw(int data, int nextTo)
    {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null && temp.data != nextTo) {
            temp = temp.next;
        }
        if (temp == tail) {
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
            return;
        }
        if(temp == null) {
            return;
        }

        newNode.next = temp.next;
        // temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;


    }
    public void addBackTo(int backTo, int data){

        Node newNode = new Node(data);

        Node temp = tail;

        while (temp != null && temp.data != backTo) {
            temp = temp.prev;
        }
        if (temp == head) {
            head.prev = newNode;
            head = newNode;
            return;
        }
        if(temp == null) {
            return;
        }
        
        
        newNode.next = temp;
        newNode.prev = temp.prev;
        temp.prev.next = newNode;
        temp.prev = newNode;
       
        
        
        // temp.prev.next = newNode;
        // newNode.next = temp;
        // newNode.prev = temp.prev;
        // temp.prev = newNode;
        
        
    }
    @SuppressWarnings("null")
    public void deleteNode(int data) {
        Node temp = head , prev2 = null;
        if (temp == null && temp.data == data) {
            return;
            
        }
        if (temp.data == head.data) {
            temp = head.next;
            temp.prev = null;
            head = temp;

            
        }
        
        while (temp != null && temp.data != data) {
            prev2 = temp;
            temp = temp.next;
            
        }
        if (temp == tail) {
            prev2.next = null;
            tail = prev2;
            
        }
        prev2.next = temp.next;

    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addNode(4);
        list.addNode(6);
        list.addNode(9);
        list.addNode(10);
        // list.addNode(76);
        // list.addNode(46);

        // list.deleteNode(46);
        
        // list.addBtw(11, 10);
        list.addBackTo(9, 7);
        list.display();
        
        // list.displayBack();
    }

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {

            this.data = data;

        }
    }
    
}
