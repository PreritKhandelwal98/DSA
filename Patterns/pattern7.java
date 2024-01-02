public class pattern7 {
  public static void pattern7(int n) {
    for (int a = n; a > 0; a--) // loop for printing rows
    {
      for (int b = n - 1; b >= a; b--) // loop for printing spaces
      {
        System.out.print(" ");
      }
      for (int b = 1; b <= a; b++) // loop for printing columns
      {
        System.out.print("*");
      }
      System.out.println(""); // changing line
    }
  }
}
