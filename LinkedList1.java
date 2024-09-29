package LinkedList;
// public class LinkedList1 {

//     public Node head = null;
//     public Node tail = null;

//     public void addNode(int data)
//     {
//         Node newNode = new Node(data);

//         if(head == null)
//         {
//             head = newNode;
//         }
//         else
//         {
//             tail.next = newNode;
//         }
//         tail = newNode;
//     }
//     public void addBtw(int nextTo, int data)
//     {
//         Node newNode = new Node(data);
//         Node temp = head;

//         while (temp != null && temp.data != nextTo) 
//         {
//             temp = temp.next;
//         }

//         if(temp == null)
//             return;

//         if(temp == tail) 
//         {
//             tail.next = newNode;
//             tail = newNode;
//             return;
//         }   

//         newNode.next = temp.next;
//         temp.next = newNode;
        
//     }

//     public void deleteData(int data){

//         Node temp = head;
//         Node prev = null;
        
//         if (temp != null && temp.data == data)
//         {
//             head = temp.next;
//             return;
//         }
       
//         while (temp != null && temp.data!= data)
//         {
//            prev = temp;
//            temp = temp.next;
//         }

//         if(temp == tail)
//         {
//             tail = prev;
//             tail.next = null;
//             return;
//         }
//         prev.next = temp.next;
//     }
    

//     public void display()
//     {
//         if (head == null)
//         {
//             System.out.println("Empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null)
//         {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }    
//     }
   

    
//     class Node {

//         int data;
//         Node next;

//         Node(int data)
//         {
//             this.data = data;
//         }

//     }

    

//     public static void main(String[] args) {
//         LinkedList1 list = new LinkedList1();
//         list.display();

//         list.addNode(25);
//         list.addNode(12);
//         list.addNode(3);
//         list.addNode(7);

//         list.deleteData(3);
//         list.addBtw(12 , 15);
//         list.display();

        
//     }
// }

// SELF - PRACTICE

public class LinkedList1 {

    public Node head;
    public Node tail;

    public void addNode (int data)
    {
        Node newNode = new Node(data);
        
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
            
        }
        tail = newNode;
 
    }

    public void addBtw(int data, int nextTo)
    {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null && temp.data != nextTo ) {
            temp = temp.next;
        }
        if(temp == null)
            return;

        if (temp == tail) {
            tail.next = newNode;
            tail = newNode;
            return;
        } 
       
        newNode.next = temp.next;
        temp.next = newNode;    
    }
    public void display()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("Linked List is Empty");
            return;
        }
            


        while (temp != null ) {
            System.out.println(temp.data);
            temp = temp.next;
        } 
    }

    public void deleteData(int data) {
        Node temp = head ,prev = null;
        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
            
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
            
        }
        if (temp == tail) {
            tail = prev;
            prev.next = null;
            return;
            
        }
        prev.next = temp.next;
    }


    class Node 
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        list.addNode(12);
        list.addNode(34);
        list.addNode(11);
        list.addNode(15);
        list.addNode(7);
        list.addNode(90);

        list.addBtw(18, 90);
        list.deleteData(12);
        list.display();
        


    }
}