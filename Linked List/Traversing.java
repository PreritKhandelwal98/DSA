package InJava.LinkedList;
public class Traversing {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void addFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // void addLast(int data){
    //     Node newNode = new Node(data);

    //     if(head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     Node lastNode = head;
    //     while(lastNode.next!=0){
    //         lastNode = lastNode.next;
    //     }
    //     lastNode.next = newNode;
    // }

    void printNode(){
        Node currNode = head;

        while(currNode.next!=null){
           System.out.print(currNode.data+" -> ");
           currNode = currNode.next;
        }
    }
    public static void main(String args[]){
        Traversing t = new Traversing();

        t.addFirst(4);
        t.addFirst(3);
        t.addFirst(2);
        t.addFirst(1);

        //t.addLast(6);
        t.printNode();

        //t.addLast(7);
        t.printNode();
    }
}
