package InJava.LinkedList;
import java.util.Scanner;
public class InsertAtAnyPosition {  
  
        //Represent a node of the singly linked list  
        class Node{  
            int data;  
            Node next;  
      
            public Node(int data) {  
                this.data = data;  
                this.next = null;  
            }  
        }  
      
        public int size;  
        //Represent the head and tail of the singly linked list  
        public Node head = null;  
        public Node tail = null;  
      
        //addNode() will add a new node to the list  
        public void addNode(int data) {  
            //Create a new node  
            Node newNode = new Node(data);  
      
            //Checks if the list is empty  
            if(head == null) {  
                //If list is empty, both head and tail will point to new node  
                head = newNode;  
                tail = newNode;  
            }  
            else {  
                //newNode will be added after tail such that tail's next will point to newNode  
                tail.next = newNode;  
                //newNode will become new tail of the list  
                tail = newNode;  
            }  
            //Size will count the number of nodes present in the list  
            size++;  
        }  
      
        //This function will add the new node at the middle of the list.  
        public void addInMid(){  
            Scanner sc = new Scanner(System.in);
            Node temp = new Node();
            Node ptr;
            int count =1,pos;

            if(head==null){
                System.out.println("Empty List");
            }

            System.out.print("Enter the Data you want to add: ");
            temp.data = sc.nextInt();
            System.out.print("Enter the position you want to add: ");
            pos = sc.nextInt();  
            
        }  
      
        //display() will display all the nodes present in the list  
        public void display() {  
            //Node current will point to head  
            Node current = head;  
            if(head == null) {  
                System.out.println("List is empty");  
                return;  
            }  
      
            while(current != null) {  
                //Prints each node by incrementing pointer  
                System.out.print(current.data + " ");  
                current = current.next;  
            }  
            System.out.println();  
        }  
      
        public static void main(String[] args) {  
      
            InsertAtAnyPosition sList = new InsertAtAnyPosition();  
            Scanner sc = new Scanner(System.in);
      
            //Adds data to the list  
            sList.addNode(1);  
            sList.addNode(2);  
            sList.addNode(3);
            sList.addNode(4);
            sList.addNode(5);
      
            System.out.println("Original list: ");  
            sList.display();  
      
            //Inserting node '3' in the middle

            //sList.addInMid(data,pos);  
            System.out.println( "Updated List: ");  
            sList.display();  
      
            // //Inserting node '4' in the middle  
            // sList.addInMid(4);  
            // System.out.println("Updated List: ");  
            // sList.display();  
        }  
    }  

