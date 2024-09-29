package LinkedList;

public class problem1 {
    
    public Node head = null;
    public Node tail = null;

    public void addNode(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public void addBtw(int nextTo, int data)
    {
        Node newNode = new Node(data);
        Node temp = head;

        while (temp != null && temp.data != nextTo) 
        {
            temp = temp.next;
        }

        if(temp == null)
            return;

        if(temp == tail) 
        {
            tail.next = newNode;
            tail = newNode;
            return;
        }   

        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    public void deleteData(int data){

        Node temp = head;
        Node prev = null;
        
        if (temp != null && temp.data == data)
        {
            head = temp.next;
            return;
        }
       
        while (temp != null && temp.data!= data)
        {
           prev = temp;
           temp = temp.next;
        }

        if(temp == tail)
        {
            tail = prev;
            tail.next = null;
            return;
        }
        prev.next = temp.next;
    }
    

    public void display()
    {
        if (head == null)
        {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }    
    }
   
    public void removeDuplicates() {
        Node current = head;
        
        while (current != null) {
            Node next = current.next;
            while (next != null && next.data == current.data) {
                next = next.next;

            }

            current.next = next;

            if (next == tail) {
                tail = current;             
            }
            current = next;
            
        }


    }
    
    class Node {

        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }

    }

    

    public static void main(String[] args) {
        problem1 list = new problem1();
        // list.display();

        list.addNode(6);
        list.addNode(10);
        list.addNode(5);
        list.addNode(5);
        list.addNode(5);
        list.addNode(8);
        list.addNode(8);

        // list.deleteData(5);
        // list.addBtw(12 , 15);

        list.removeDuplicates();
        list.display();
        
    
    
}
}
