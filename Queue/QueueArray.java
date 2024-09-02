public class QueueArray {
    int queue[];
    int size;
    int rear,front;
    QueueArray(int size)
    {
        this.size=size;
        queue=new int[size];
        rear=front=0;
    }
    public void enqueue(int val)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            return;
        }
        queue[rear++]=val;
    }
    public boolean isEmpty()
    {
        return front==rear;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front++];
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<rear;i++)
        {
            System.out.print(queue[i]+" ");
        }
    }
    public boolean isFull()
    {
        return rear==size;
    }
    public void update(int pos,int val)
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        if(pos<front ||pos>rear-front)
        {
            System.out.print("unable to insert");
            return;
        }
        queue[pos]=val;
    }
    public void sum()
    {
        
    }
    public static void main(String[] args) {
        QueueArray q=new QueueArray(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();

        System.out.println();
        System.out.println("removed element is "+q.dequeue());
        q.display();
        q.update(4, 7);
        System.out.println();
        q.display();
        
    }
}
