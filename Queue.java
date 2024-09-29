package StackAndQueue;

public class Queue {
    public static void main(String[] args) {
        
        Queue qu = new Queue();

        qu.enQueue(1);
        qu.enQueue(2);
        qu.enQueue(3);
        qu.enQueue(4);

        qu.deQueue();

        qu.display();
    }

    public Node front;
    public Node rear;

    public void enQueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void deQueue() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        front = front.next;

        if (front == null) {
            rear = null;
        }

    }
    
    public void display() {
        Node current = front;

        if (front == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
