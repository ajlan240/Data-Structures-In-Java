package LinkedList;

// leetcode problem 
// 83. remove duplicates from sorted array

 class LinkedListQn2 {
    
    Node head;
    Node tail;
    int size = 0;

     class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        
 }

 public void insertFirst(int val) {
    Node newNode = new Node(val);
    newNode.next = head;
    head = newNode;

    if (tail == null) {
        tail = head;
     }
    size++;
}

 public void display() {
    Node currentNode = head;
    while (currentNode != null) {
        System.out.print(currentNode.val + " -> ");
        currentNode = currentNode.next;
    }
    System.out.println("END");
    
 }

 public void removeDuplicates() {
    Node current = head;
    while (current.next != null) {
        if (current.val == current.next.val) {

            current.next = current.next.next;
            size--;

        } else {
            current = current.next;
        }
        
    }
    tail = current;
    tail.next = null;
 }

 public static void main(String[] args) {
    LinkedListQn2 list = new LinkedListQn2();

    list.insertFirst(1);
    list.insertFirst(1);
    list.insertFirst(4);
    list.insertFirst(4);
    list.insertFirst(4);
    list.insertFirst(6);
    list.insertFirst(6);
    list.insertFirst(9);

    System.out.println("Before removing duplicates");
    list.display();

    list.removeDuplicates();
    System.out.println("After removing duplicates");
    list.display();
 }

 }

