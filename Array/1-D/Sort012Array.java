public class Sort012Array
{
	public static void main(String[] args) {
		int[] arr ={2,0,2,2,0,1,1};
		System.out.println("Array Before Sorting");
		printArray(arr);
		sort012Array(arr);
		System.out.println("");
		System.out.println("Array After Sorting");
		printArray(arr);
		
	}
	
	public static void sort012Array(int[] arr){
	    int i=0,j=0;
	    int k=arr.length-1;
	    
	    while(i<=k){
	        if(arr[i]==0){
	            swap(arr,i,j);
	            i++;
	            j++;
	        }else if(arr[i]==1){
	            i++;
	        }else if(arr[i]==2){
	            swap(arr,i,k);
	            k--;
	        }
	    }
	}
	
	public static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}

	
	public static void printArray(int[] arr){
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+",");
	    }
	}
}
