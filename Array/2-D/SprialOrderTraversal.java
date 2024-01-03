package Array.2-D;

public class SprialOrderTraversal {
  public static void main(String[] args) {
    int[][] arr = {
        { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 27, 29, 37, 48 },
        { 32, 33, 39, 52 }
    };

    spiralOrderMatrixPrint(arr, 4, 4);
  }

  public static void spiralOrderMatrixPrint(int[][] arr, int col, int row) {
    int i, k = 0, l = 0;
    while (k < row && l < col) {
      // This for loop traverse from left to right
      for (i = k; i < col; i++) {
        System.out.print(arr[k][i] + " ");
      }
      k++;
      // This for loop traverse from top to bottom
      for (i = k; i < row; i++) {
        System.out.print(arr[i][col - 1] + " ");
      }
      col--;

      // This for loop traverse from right to left
      if (k < row) {
        for (i = col - 1; i >= l; i--) {
          System.out.print(arr[row - 1][i] + " ");
        }
        row--;
      }
      // This for loop traverse from bottom to up
      if (l < col) {
        for (i = row - 1; i >= k; i--) {
          System.out.print(arr[i][l] + " ");
        }
        l++;
      }
    }
  }
}
