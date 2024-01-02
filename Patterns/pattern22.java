public class pattern22 {
  public static void pattern22(int n) {
    // int num =1;
    for (int i = 0; i <= n; i++) {

      for (int j = 0; j < i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("0 ");
        } else if ((i + j) % 2 == 1) {
          System.out.print("1 ");
        }

        // num++;
      }
      System.out.println();
    }
  }
}
