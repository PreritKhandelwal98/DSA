package Queue;

import java.util.NoSuchElementException;

public class QueueUsingLinkedList{
    private ListNode front;
    private ListNode rear;
    private int length;

    public QueueUsingLinkedList(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        int result= front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length --;
        return result;
    }

    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already Empty");
        }
        return front.data;
    }

    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already Empty");
        }
        return rear.data;
    }

    public void print(){
        if(isEmpty()){
            return;
        }

        ListNode current = front;
        while(current !=null){
            System.out.print(current.data +" --> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String [] args){
        QueueUsingLinkedList queue = new QueueUsingLinkedList(); 

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        // queue.dequeue();
        // queue.dequeue();

        queue.print();

        System.out.println(queue.first());
        System.out.println(queue.last());

    }
}