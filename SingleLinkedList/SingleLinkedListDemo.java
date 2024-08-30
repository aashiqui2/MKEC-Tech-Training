public class SingleLinkedListDemo {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }
    Node head;
    SingleLinkedListDemo() {
        head = null;
    }

    public void insertAtBegin(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinkedListDemo ll = new SingleLinkedListDemo();
        ll.insertAtBegin(3);
        ll.insertAtBegin(2);
        ll.insertAtBegin(1);
        ll.display();
    }
}