public class pattern21 {
  public static void pattern21(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {

      for (int j = 0; j < i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }
}
