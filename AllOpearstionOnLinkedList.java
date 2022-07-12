package InJava.LinkedList;
import java.util.Scanner;
public class AllOpearstionOnLinkedList
{
   static class Node
    {
        int data;
        Node next;

        Node()
        {
        	}
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node start = null;   

    public static void traverse(){
        Node temp;

        if(start == null){
            System.out.println("List is empty");
        }

        else{
            temp = start;
            while(temp!=null){
                System.out.println("Data = "+temp.data);
                temp = temp.next;
            }
        }
    }

    public static void InsertAtFirst(){
    
        int data;
        Node temp = new Node();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be inserted");
        data = sc.nextInt();
        temp.data = data;

        temp.next = start;
        start = temp;         
    } 

    public static void InsertAtLast(){
        int data;
        
        Node head;
        Node temp = new Node();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be inserted");
        data = sc.nextInt();
        
        temp.next = null;
        temp.data = data;
        head = start;
        while(head.next!=null){
            head = head.next;
        }
        head.next = temp;
    }

    public static void InsertAtAnyPos(){
        Node temp;
        Scanner sc = new Scanner(System.in);
        int pos,data,i=1;
        Node newNode = new Node();

        System.out.println("Enter the position");
        pos = sc.nextInt();
        System.out.println("Enter the data");
        data = sc.nextInt();

        temp=start;
        newNode.data = data;
        newNode.next=null;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void DeleteFromFirst(){
        Node temp;
        if(start == null){
            System.out.println("List is empty");
        }else{
            temp=start;
            start=start.next;
            //free(temp);
        }
    }

    public static void DeletefromLast(){
        Node temp,prevnode;
        prevnode = new Node();
        if (start == null)
            System.out.println("List is Empty");
        else {
            temp = start;
            while (temp.next != null) {
                prevnode = temp;
                temp = temp.next;
            }
            //free(temp);
            prevnode.next = null;
        }
    }

    public static void DeleteAtAnyPos(){

        Scanner sc =new Scanner(System.in);
        Node temp, position;
	    int i = 1, pos;

	    // If LL is empty
	    if (start == null)
		    System.out.println("List is empty");

	    // Otherwise
	    else {
		    System.out.println("Enter index : ");
		    pos = sc.nextInt();
		    position = new Node();
		    temp = start;

		    // Traverse till position
		    while (i < pos - 1) {
			    temp = temp.next;
			    i++;
		    }

		// Change Links
		position = temp.next;
		temp.next = position.next;

		// Free memory
		//free(position);
	}
    }

    public static void display() {  
        //Node current will point to head  
        Node current = start;  
        if(start == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the start of the list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  

    public static void printInReverse(){
        Node t1,t2,temp;
        t1=t2=null;

        if(start == null){
            System.out.println("List is Empty");
        }
        else{
            while(start!=null){
                t2 = start.next;
                start.next = t1;
                t1 = start ;
                start = t2 ;
            }
            start = t1;

            temp = start;

        }
        
    }
  

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char repeat = 'y';
        //Mainob = new AllOpearstionOnLinkedList();

        do{
            System.out.println("What do you want to perform over linked list\nPress 1 for Add in front\nPress 2 for Add at last\nPress 3 for Add at any position\nPress 4 for Delete from front\nPress 5 for Delete from last\nPress 6 for Delete from any position\nPress 7 to Display\nPress 8 to Traverse\nPress 9 to print list in reverse order");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
        switch(ch){
            case 1:InsertAtFirst();
            break;
            case 2:InsertAtLast();
            break;
            case 3:InsertAtAnyPos();
            break;
            case 4:DeleteFromFirst();
            break;
            case 5:DeletefromLast();
            break;
            case 6:DeleteAtAnyPos();
            break;
            case 7:display();
            break;
            case 8:traverse();
            break;
            case 9:printInReverse();
            default:System.out.println("Invalid Input");
        }
        System.out.println("Do you want to do it again\nEnter your choice: ");
        repeat = sc.next().charAt(0);
    }while(repeat=='y' || repeat=='Y');

    if(repeat=='n' || repeat=='N'){
        System.out.println("Thank You for choosing us!!\nVisit again");
    }
    
        sc.close();
    }
}
