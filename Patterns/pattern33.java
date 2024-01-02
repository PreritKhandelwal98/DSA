public class pattern33 {
  public static void pattern33(int n) {
    // int num =1;
    char ch = 'a';
    for (int i = 0; i < n; i++) {

      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 1) {
          System.out.print(Character.toUpperCase(ch));
          ch++;
        } else {
          System.out.print(Character.toLowerCase(ch));
          ch++;
        }
      }
      System.out.println(" ");
      ;
    }
  }
}
