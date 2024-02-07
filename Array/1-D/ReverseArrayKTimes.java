public class ReverseArrayKTimes
{
	public static void main(String[] args) {
		int[] arr = {23,34,45,56,76,43,1};
		int k=3;
		int n=arr.length;
		System.out.println("Before reversing");

		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		Rotateeletoright(arr,n,k);
		
		System.out.println("After reversing");

		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
	
	public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  // Function to Rotate k elements to right
  public static void Rotateeletoright(int[] arr, int n, int k) {
    // Reverse first n-k elements
    Reverse(arr, 0, n - k - 1);
    // Reverse last k elements
    Reverse(arr, n - k, n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
  }
}
