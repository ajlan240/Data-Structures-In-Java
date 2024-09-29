package LinkedList;
// 21.Merging two linked list
class LLQn3 {
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
    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        
        tail = newNode;
    }
    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value+ " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("END");
    }
        
    public LLQn3 merge(LLQn3 first, LLQn3 second) {
        Node f = first.head;
        Node s = second.head;
        LLQn3 ans = new LLQn3();
        while (f != null && s != null ) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        
        return ans;
    }

    public static void main(String[] args) {
        LLQn3 list1 = new LLQn3();
        LLQn3 list2 = new LLQn3();
        

        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);

        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);
        
        LLQn3 ans = new LLQn3();

        ans = ans.merge(list1, list2);
        ans.display();
    }
}

    
    