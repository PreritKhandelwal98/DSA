// Count of subarrays with odd sum:
public class OddSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3 };
        System.out.println("Count of subarrays with odd sum: " + countSubarrays(arr));
    }

    public static int countSubarrays(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
