package InJava.Array.ArrayInsertion;
import java.util.Scanner;

public class AtFirst {
    public static void main(String args[]){
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);

        //Asking for size of array
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();

        //Entering element in array
        System.out.println("Enter Element for Array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        //Printing array before insertion
        System.out.println("Array Before Insertion");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        //Adding new element in array
        System.out.println("");
        System.out.println("Enter new element");
        int ele = sc.nextInt();
        size++;
        for(int i=size;i>1;i--){
           arr[i-1] = arr[i-2];
        }
        arr[0] = ele;

        //Printing array after insertion
        System.out.println("Array After Insertion");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }


        sc.close();
    }
}
