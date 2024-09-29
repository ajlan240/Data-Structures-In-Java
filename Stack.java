package StackAndQueue;

public class Stack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // stack.pop();
        
        stack.display();
    }
    Node top;


    // to set a value to LinkedList in the form of stack
    public void push(int data)  {

        Node newNode = new Node(data);

        if (top == null) { // if there is Nothing inside the LinkedList
            top = newNode;
        } else {  // if there is something inside Node
            newNode.next = top;
            top = newNode;
        }

    }

// to remove Something from the LinkedList

public void pop() {

    if (top == null) {
        System.out.println("Stack Underflow");
        return;
    }
    top = top.next;
}

    public void display() {
        Node current = top;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("End");
    }
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    
}
