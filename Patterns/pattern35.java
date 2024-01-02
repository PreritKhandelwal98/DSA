public class pattern35 {
  public static void pattern35(int n) {
    // int num =1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      for (int k = 1; k <= 2 * (n - i); k++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      System.out.println(" ");
      ;

    }
  }
}
