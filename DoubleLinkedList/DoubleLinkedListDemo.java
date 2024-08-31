import java.util.Scanner;;

public class DoubleLinkedListDemo {
    class Node {
        Node prev;
        int data;
        Node next;

        Node(int val) {
            data = val;
            prev = null;
            next = null;
        }
    }

    Node head;

    DoubleLinkedListDemo() {
        head = null;
    }

    public void insertAtBegin(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
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
            newnode.prev = temp;
        }
    }

    public void insertAtPos(int val, int pos) {
        if (head == null) {
            System.out.println("List is empty unable to insert");
            return;
        }
        if (pos == 0) {
            insertAtBegin(val);
            return;
        } else {
            Node newnode = new Node(val);
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Unable to insert list is empty");
                return;
            }
            if (temp.next == null) {
                temp.next = newnode;
            } else {
                newnode.next = temp.next;
                temp.next.prev = newnode;
                temp.next = newnode;
                newnode.prev = temp;
            }
        }
    }

    public void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
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
        }
        if (pos == 0) {
            deleteAtBegin();
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Unable to delete At pos");
                return;
            }
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            } else {
                head = head.next;
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        int val = 0, ch = 0;
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListDemo dl = new DoubleLinkedListDemo();
        while (true) {
            System.out.println("\n--------Linked List Menu-----------");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at specified position");
            System.out.println("4. Display the list");
            System.out.println("5. Delete at Beginning");
            System.out.println("6. Delete at End");
            System.out.println("7. Delete from specified position");
            System.out.println("8. Search the element");
            System.out.println("9. Find the length");
            System.out.println("10. Exit");
            System.out.println("--------------------------------------");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the value to insert");
                    val = sc.nextInt();
                    dl.insertAtBegin(val);
                    break;
                case 2:
                    System.out.println("Enter the value to insert");
                    val = sc.nextInt();
                    dl.insertAtEnd(val);
                    break;
                case 3:
                    System.out.println("Enter the value to insert");
                    val = sc.nextInt();
                    System.out.println("Enter the position");
                    int pos = sc.nextInt();
                    dl.insertAtPos(val, pos);
                    break;

                case 4:
                    dl.display();
                    break;
                case 5:
                    dl.deleteAtBegin();
                    break;
                case 6:
                    dl.deleteAtEnd();
                    break;
                case 7:
                    System.out.println("Enter the position");
                    pos = sc.nextInt();
                    dl.deleteAtPos(pos);
                    break;
                case 10:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
