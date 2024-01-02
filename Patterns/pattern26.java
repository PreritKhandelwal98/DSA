public class pattern26 {
  public static void pattern26(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {

      for (int j = 0; j <= n - i - 1; j++) {
        System.out.print(num);

      }
      num++;
      System.out.println();
    }
  }
}
