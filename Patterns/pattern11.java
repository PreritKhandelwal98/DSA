public class pattern11 {
  public static void pattern11(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (i * 2) - 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
