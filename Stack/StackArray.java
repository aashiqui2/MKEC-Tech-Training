public class StackArray {
    int[] stack;
    int size;
    int top;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = val;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <=top; i++) {
            System.out.print(stack[i] + " ");
        }
    }
    public int peek()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    public void update(int pos,int val)
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        if(pos<0 || pos>top)
        {
            System.out.println("Unable to insert");
            return ;
        }
        int old=stack[pos];
        stack[pos]=val;
        System.out.println("updated value from "+old+" is "+stack[pos]);
    }
    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.display();
        System.out.println();
        System.out.println("popped element "+s.pop());
        System.out.println("Toppest element is "+s.peek());
        s.display();
        System.out.println();
        s.update(4, 1);
        s.display();



    }
}