public class StackLinkedList {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node top;

    StackLinkedList() {
        top = null;
    }

    public void push(int val) {
        Node newnode = new Node(val);
        newnode.next = top;
        top = newnode;

    }
    public boolean isEmpty()
    {
        return top==null;
    }

    public void display() {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        Node temp=top;
        top=top.next;
        return temp.data;

    }
    public void update(int pos,int val)
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return; 
        }
        if(pos<0 || pos>=size())
        {
            System.out.println("Unable to insert");
            return;
        }
        Node temp=top;
        for(int i=size()-pos-1;i>=0;i--){//i=
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("Unable to insert");
            return;
        }
        temp.data=val;
    }
    public int size()
    {
        int count=0;
        Node temp=top;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        StackLinkedList sl = new StackLinkedList();
        sl.push(5);
        sl.push(4);
        sl.push(3);
        sl.push(2);
        sl.push(1);
        sl.display();
        System.out.println();
        System.out.println("Toppest element is "+sl.peek());
        System.out.println("the popped element is "+sl.pop());
        sl.update(0, 0);
        System.out.println("No of Nodes "+sl.size());
        sl.display();

    }
}
