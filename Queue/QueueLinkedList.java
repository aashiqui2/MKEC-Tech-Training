public class QueueLinkedList {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node front, rear;

    QueueLinkedList() {
        front = rear = null;
    }

    public void enqueue(int val) {
        Node newnode = new Node(val);
        if (isEmpty()) {
            newnode.next = front;
            front = newnode;
            rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }

    }

    public boolean isEmpty() {
        return front == null;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        Node temp = front;
        front = front.next;
        return temp.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void update(int pos,int val)
    {

    }
    public int count()
    {

    }
    public void sum()
    {
        
    }

    public static void main(String[] args) {
        QueueLinkedList ql = new QueueLinkedList();
        ql.enqueue(1);
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);
        ql.display();
        System.out.println();
        System.out.println("Removed element is " + ql.dequeue());
        ql.display();

    }
}
