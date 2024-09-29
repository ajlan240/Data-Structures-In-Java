 class LinkedList2 {
    Node head;
    Node tail;
    int size = 0;

    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        
    }

    // to insert a value at first
    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;

    }

    // insert using recursion
    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }
    private Node insertRec(int value, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(value, node);
            size++;
            return newNode;
        }

        node.next = insertRec(value, index--, node.next);


        return node;
    }

    // public void display

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value+ " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {

        LinkedList2 list = new LinkedList2();

        list.insertFirst(23);
        list.insertFirst(56);
        list.insertFirst(12);
        list.insertFirst(77);
        list.insertFirst(90);
        System.out.println(list.size);
        list.display();
        System.out.println();
        
        list.insertRec(16, 2);
        list.display();
        

        
    }
}