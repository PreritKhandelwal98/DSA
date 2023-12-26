package InJava.Sorting;
import java.util.Scanner;
public class MergeSort {  
        public static void conquer(int[] arr,int si ,int mid, int ei){
                int b[] = new int[ei-si+1];

                int idx1 = si;
                int idx2 = mid+1;
                int x = 0;

                while(idx1<=mid && idx2<=ei){
                        if(arr[idx1] <=arr[idx2]){
                                b[x++] = arr[idx1++];
                        }else{
                                b[x++] = arr[idx2++];
                        }
                }

                while(idx1 <= mid){
                        b[x++] = arr[idx1++];
                }

                while(idx2 <= ei){
                        b[x++] = arr[idx2++];
                }

                for(int i=0, j=si;i<b.length;i++,j++){
                        arr[j] = b[i];
                }

        }
        public static void devide(int[] arr,int si , int ei){
                int mid = si + (ei-si)/2;

                if(si>=ei){
                        return;
                }

                devide(arr,si,mid);
                devide(arr,mid+1,ei);
                conquer(arr,si,mid,ei);
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
                 
                 
                System.out.println("Array Before Merge Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                devide(arr,0,arr.length-1);
                 
                System.out.println("Array After Merge Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  

                sc.close();
   
        }  
}
