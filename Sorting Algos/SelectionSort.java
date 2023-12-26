package InJava.Sorting;
import java.util.Scanner;
public class SelectionSort {  
    static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length; i++)  
        {  
            int min = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[min]){  
                    min = j;//searching for lowest index  
                }  
            }  
            int temp = arr[min];   
            arr[min] = arr[i];  
            arr[i] = temp;  
        }  
    }  
       
    public static void main(String a[]){    
        Scanner sc = new Scanner(System.in); 
                System.out.println("Enter Size of Array");
                int n = sc.nextInt();
                int arr[] =new int[n]; 
                System.out.println("Enter Value for Array");
                for(int i=0;i<n;i++){
                    arr[i] = sc.nextInt();
                }
        System.out.println("Before Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        sc.close();
    }  
}