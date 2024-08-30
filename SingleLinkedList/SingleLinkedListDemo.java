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
        Node newnode=new Node(val);
        if (pos == 0)
        {
            insertAtBegin(val);
            return;
        }
        else if(head.next==null)
        {
            head.next=newnode;
        }
        else{
            Node temp=head;
            for(int i=0;i<pos-1;i++)
            {
                temp=temp.next;
            }
            if(temp==null)
            {
                System.out.println("invalid Position");
                return;
            }
            newnode.next=temp.next;
            temp.next=newnode;
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
        ll.insertAtEnd(4);
        ll.insertAtPos(5, 5);
        ll.display();
    }
}