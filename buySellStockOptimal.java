import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i=0;i<arr.length;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    int maxProfit = 0;
	    int min = arr[0];
	    for(int i=0;i<arr.length;i++){
	           min = Math.min(arr[i],min);
	           int curProfit = arr[i] - min;
	           maxProfit = Math.max(curProfit,maxProfit);
	    }
	    System.out.println("The Profit is : "+maxProfit);
	}
}
