public class pattern10 {
  public static void pattern10(int n) {
    for (int a = 0; a < n; a++) // loop for printing rows
    {
      // space
      for (int b = 0; b < (n - a - 1); b++) // loop for printing spaces
      {
        System.out.print("  ");
      }
      // star
      for (int b = 0; b < (1 + 2 * a); b++) // loop for printing columns
      {
        System.out.print(" * ");
      }
      // space
      for (int b = 0; b < (n - a - 1); b++) // loop for printing spaces
      {
        System.out.print(" ");
      }
      System.out.println(); // changing line
    }
  }
}
