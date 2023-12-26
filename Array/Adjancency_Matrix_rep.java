package InJava.Tree;

public class Adjancency_Matrix_rep {
    public static void main(String args[]){
        int n=3,m=3;
        int Mat[][] = new int[n][m];

        //edge between 1---2 (if undirectional)
        Mat[1][2]=1;
        Mat[2][1]=1;


        //edge between 1---3
        Mat[1][3]=1;
        Mat[3][1]=1;


        //edge between 2---1
        Mat[2][1]=1;
        Mat[1][2]=1;

        
    }
}
