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

    public void insertAtEnd(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void insertAtPos(int val, int pos) {
        Node newnode = new Node(val);
        if (pos == 0) {
            insertAtBegin(val);
            return;
        }
        if (head == null) {
            System.out.println("Unable to insert list is empty");
            return;
        } else if (head.next == null) {
            head.next = newnode;
        } else {
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("invalid Position");
                return;
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
            head = head.next;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (head.next == null) {
            head = head.next;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (pos == 0) {
            deleteAtBegin();
            return;
        } else {
            Node temp = head;
            Node prev = null;
            for (int i = 0; i < pos; i++) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Unable tp delete in the pos");
                return;
            }
            prev.next = temp.next;
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

    public int count() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public boolean search(int val) {
        Node temp = head;
        while (temp!= null) {
            if (temp.data == val) {
                return true;
            } else {
                temp = temp.next;
            }
        }

        return false;
    }
    public void update(int val,int k)
    {
        
    }

    public static void main(String[] args) {
        SingleLinkedListDemo ll = new SingleLinkedListDemo();
        ll.insertAtBegin(3);
        ll.insertAtBegin(2);
        ll.insertAtBegin(1);
        ll.insertAtEnd(4);
        ll.insertAtPos(5, 4);
        ll.deleteAtBegin();
        ll.deleteAtEnd();
        ll.deleteAtPos(3);
        System.out.println("No of nodes is " + ll.count());
        System.out.println(ll.search(5));
        ll.update(4,5);
        ll.display();

    }
}