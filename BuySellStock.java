import java.util.Scanner;
public class BuySellStock.
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
	        for(int j=0;j<arr.length;j++){
	            int curProfit = arr[j] - arr[i];
	            if(curProfit>maxProfit){
	                maxProfit = curProfit;
	            }
	        }    
	    }
	    System.out.println("The Profit is :"+maxProfit);
	}
}
