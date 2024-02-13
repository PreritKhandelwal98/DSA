import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.synth.SynthStyle;

import java.util.Arrays;
import java.util.HashSet;
public class RepeatandMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findRepeatingAndMissingNumbers(arr);
    }

    public static void findRepeatingAndMissingNumbers(int[] nums) 
    {
    	// Write your code here
        int n = nums.length;
        int repeat=0;
        int missing=0;

        Arrays.sort(nums);

        Set<Integer> numSet = new HashSet<>();
        for(int element:nums){
            if(numSet.contains(element)){
                repeat=element;
                break;
            }
            numSet.add(element);
        }

        int actualSum=0;
        int expectedSum = n * (n + 1) / 2;
        for(int element :nums){
            actualSum+=element;
        }

        missing = expectedSum-actualSum+repeat;

        int[] result ={repeat,missing};
       
        System.out.println("Repeating element is :"+result[0]);
        System.out.println("Missing element is :"+result[1]);
       
    }
}
