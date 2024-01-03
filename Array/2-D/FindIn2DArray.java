public class FindIn2DArray {
  public static void main(String[] args) {
      int[][] arr = { 
                      {10, 20, 30, 40}, 
                      {15, 25, 35, 45}, 
                      {27, 29, 37, 48}, 
                      {32, 33, 39, 52}
                  }; 
      findIn2DArray(arr, 4, 2);
  }

  public static void findIn2DArray(int[][] arr, int n, int key) {
      int i = 0;
      int j = n - 1;
      boolean found = false;

      while (i < n && j >= 0) {
          if (arr[i][j] == key) {
              System.out.println("Key Found at " + i + " " + j);
              found = true;
              break;
          }
          if (arr[i][j] > key) {
              j--;
          } else {
              i++;
          }
      }

      if (!found) {
          System.out.println("Key not Found :(");
      }
  }
}
