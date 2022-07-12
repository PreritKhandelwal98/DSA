package InJava.Sorting;
import java.util.Scanner;
public class BubbleSort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                int flag=0; 
                for(int j=0; j < n-1-i; j++){  //here n-1-i condition is for large number of data when we don't want last index element to consider as it get it's correct position in first pass.
                        if(arr[j] > arr[j+1]){  
                                //swap elements  
                                temp = arr[j];  
                                arr[j] = arr[j+1];  
                                arr[j+1] = temp;  
                                flag=1;
                        }  
                          
                }  
                if(flag==0){
                        break;
                }
        }  
  
}  
    public static void main(String[] args) { 
                Scanner sc = new Scanner(System.in); 
                System.out.println("Enter Size of Array");
                int n = sc.nextInt();
                int arr[] =new int[n]; 
                System.out.println("Enter Value for Array");
                for(int i=0;i<n;i++){
                    arr[i] = sc.nextInt();
                }
                 
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                sc.close();
   
        }  
}