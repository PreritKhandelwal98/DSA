public class pattern6 {
  public static void pattern6(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
