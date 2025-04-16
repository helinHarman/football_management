package dataprojectreal;
public class MatchProcess {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    public MatchProcess(int capacity) {
        queue = new String[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    public void push(String item) {
        if (size == queue.length) {
            System.out.println("Kuyruk dolu, eleman eklenemiyor.");
           return;
        }
        if (front == -1) {  
           front = 0;
        }
        rear = (rear + 1) % queue.length; 
        queue[rear] = item;
        size++;
    }

 
    public String pop() {
        if (size == 0) {
            System.out.println("Kuyruk boş, eleman yok.");
            return null;
        }
        String item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;
    }
    public String peek() {
        if (size == 0) {
            System.out.println("Kuyruk boş.");
            return null;
        }
        return queue[front];
    }
    public boolean isEmpty() {
        return size == 0;
    }

    
    public int size() {
        return size;
    }
    
    public static class Node {
    int data;
    Node next;
    
    public Node(int d){
        data = d;
        next=null;
    }
}

    public String[] getQueue() {
        return queue;
    }

    public void setQueue(String[] queue) {
        this.queue = queue;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    

    }
