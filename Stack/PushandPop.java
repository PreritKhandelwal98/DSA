package InJava.Stack.ArrayImplimentation;
import java.util.Scanner;
public class PushandPop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char ans = 'y';
        int top=-1;

        System.out.println("Enter the size of Stack");
        int size = sc.nextInt();

        int arr[] = new int[size];
        do{
            System.out.println("Enter you choice\nPress 1 for PUSH\nPress 2 for POP\nPress 3 for DISPLAY");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                        if(top==size-1){
                            System.out.println("Stack Underflow");
                        }
                        else{
                            System.out.println("Enter value for Stack");
                            int val = sc.nextInt();
                            top++;
                            arr[top] = val;
                            System.out.println(val+" is pushed");
                        }
                break;
                case 2: if(top==-1){
                            System.out.println("Stack is empty nothing to POP");
                        }else{
                            int val = arr[top];
                            System.out.println(val+" is poped");
                            top--;
                        }
                break;
                case 3: System.out.println("Value present in Stack : ");
                        for(int i=0;i<=top;i++){
                            System.out.println(arr[i]);
                        }
                break;
                default:System.out.println("Invalid Input");
                break;
            }
            System.out.println("Do you want to continue? (Y/N)");
            ans = sc.next().charAt(0);
        }while(ans=='y'||ans=='Y');
        if(ans=='n' || ans=='N'){
            System.out.println("Thank You");
        }
        sc.close();
    }
}
