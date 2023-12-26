package InJava.Sorting;
import java.util.Scanner;

class QuickSort{
    

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low]; 
        int i = (low - 1); 

        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot) 
            {
                i++; 
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

   
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) 
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

   
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
            
        System.out.println();
    }

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements for Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        
        quickSort(arr, 0, n - 1);
        
        System.out.println("Sorted array: ");
        printArray(arr, n);
        sc.close();
    }
}