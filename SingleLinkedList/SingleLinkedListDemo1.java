import java.util.Iterator;

public class SingleLinkedListDemo1<T> implements Iterable {
    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    Node head;

    SingleLinkedListDemo1() {
        head = null;
    }

    public void insertAtBegin(T val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertAtEnd(T val) {
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

    public void insertAtPos(T val, int pos) {
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

    public boolean search(T val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            } else {
                temp = temp.next;
            }
        }

        return false;
    }

    public boolean update(T val, T k) {
        if (head == null) {
            System.out.println("List is empty unable to insert");
            return false;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == val) {
                    temp.data = k;

                    return true;
                } else {
                    temp = temp.next;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SingleLinkedListDemo1<Double> ll = new SingleLinkedListDemo1<>();
        ll.insertAtBegin(3.0);
        ll.insertAtBegin(2.0);
        ll.insertAtBegin(1.0);
        ll.insertAtEnd(4.0);
        ll.insertAtPos(5.0, 4);
        ll.deleteAtBegin();
        ll.deleteAtEnd();
        ll.deleteAtPos(3);
        System.out.println("No of nodes is " + ll.count());
        System.out.println(ll.search(5.0));
        if (ll.update(4.0, 5.0)) {
            System.out.println("Value is updated");
        } else {
            System.out.println("Value is Not in the list");
        }
        // ll.display();

        // using iterator
        Iterator<Double> l1 = ll.iterator();
        while (l1.hasNext()) {
            System.out.print(l1.next() + "->");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = head;

            public boolean hasNext() {
                return temp != null;
            }

            public T next() {
                T val = temp.data;
                temp = temp.next;
                return val;
            }

        };
    }

}