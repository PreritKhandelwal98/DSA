public class SubArray {

    static void SubArray(int a[]) {
        int n = a.length;
        for (int sp = 0; sp < n; sp++) {
            for (int ep = sp; ep < n; ep++) {
                for (int i = sp; i <= ep; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40 };
        SubArray(arr);
    }
}
