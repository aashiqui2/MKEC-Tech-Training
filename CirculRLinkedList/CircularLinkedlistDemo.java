public class CircularLinkedlistDemo {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    CircularLinkedlistDemo() {
        head = null;
    }

    public void insertAtBegin(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            newnode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertAtEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            newnode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    public void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        else{
            Node temp=head;
            while(temp.next.next!=head)
            {
                temp=temp.next;
            }
            temp.next=head;
        }
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        CircularLinkedlistDemo cl = new CircularLinkedlistDemo();
        cl.insertAtBegin(3);
        cl.insertAtBegin(2);
        cl.insertAtBegin(1);
        cl.insertAtEnd(4);
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.deleteAtEnd();
        cl.display();
    }
}
