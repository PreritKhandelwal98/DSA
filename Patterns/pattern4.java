public class pattern4 {
  public static void pattern4(int n) {
    for (int i = 1; i <= n; i++) {
      int num = 1;
      for (int j = 1; j <= i; j++) {
        System.out.print(num);
        num++;
      }
      System.out.println();
    }
  }
}
