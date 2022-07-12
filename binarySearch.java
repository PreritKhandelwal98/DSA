package InJava.Searching;
import java.util.Scanner;
public class binarySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

        System.out.println();
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();


        int first = arr[0];
        int last  = arr.length-1; 
        int mid = (first + last)/2;
        while( first <= last ){  
            if ( arr[mid] < key ){  
                first = mid + 1;     
            }else if ( arr[mid] == key ){  
              System.out.println("Element is found at index: " + mid);  
              break;  
            }else{  
                last = mid - 1;  
            }  
            mid = (first + last)/2;  
         }  
         if ( first > last ){  
            System.out.println("Element is not found!");  
         }  

        sc.close();
    }
}