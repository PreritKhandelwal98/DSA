package InJava.Sorting;
import java.util.Scanner;
public class InsertionSort {  
        static void insertionSort(int[] arr){
                for(int i=1;i<arr.length;i++){
                        int temp = arr[i];
                        int j=i;
                        while(j>0 && arr[j-1]>temp){
                              arr[j]=arr[j-1];
                              j=j-1;
                        }
                        arr[j] = temp;
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
                  
                insertionSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                sc.close();
   
        }  
}