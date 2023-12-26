import java.util.Scanner;
public class MatrixSubs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        int mat1[][] = new int[rows][columns];
        int mat2[][] = new int[rows][columns];
        int res[][] = new int[rows][columns];

        System.out.println("Enter value for matrix 1:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter value for matrix 2:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                res[i][j] = mat1[i][j] - mat2[i][j];
            }
        }

        System.out.println("Substraction of two  matrix:-");
        for ( int i= 0 ; i < rows ; i++ )
        { 
            for (int j= 0 ; j < columns ;j++ )
            System.out.print(res[i][j]+"\t");
            System.out.println();
        }

        sc.close();
    }
}
