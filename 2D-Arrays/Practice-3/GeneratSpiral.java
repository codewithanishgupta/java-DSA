
import java.util.Scanner;

public class GeneratSpiral {

    static void printMatrix(int [][] matrix){
       int  n=matrix.length;
       for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
       }
    }

    static int [][] spiralOrderElement (int n){
        int topRow = 0 , buttomRow = n-1 ,leftColumn = 0 , rightColumn=n-1  ;
        int current = 1;

        int matrix [][] = new int[n][n];
        
        while(current <= n*n ){
            // topRow -> leftColumn to ReghtColumn
            for(int i = leftColumn ; i <= rightColumn && current <= n*n ; i++){
                matrix [topRow][i]=current++;       

            }
            topRow ++; 

            // rightColumn -> topRow To buttomRow
            for(int j = topRow ; j <= buttomRow && current <= n*n ; j++){
                matrix[j][rightColumn]=current++;

            }
            rightColumn --;

            // buttomRow -> rightColumn to leftColumn
            for(int i = rightColumn ; i >= leftColumn && current <= n*n ; i--){
                matrix[buttomRow][i] = current++;

            }
            buttomRow --;

            // leftColumn -> buttomRow to topRow
            for(int j = buttomRow ; j >= topRow && current <= n*n ; j--){
                matrix[j][leftColumn]=current++;
            }
            leftColumn ++;
        }
        return  matrix;
    }
    public static void main(String[] args) {
        System.out.print("Enter n number : ");
        int n = new Scanner(System.in).nextInt();

        int matrix [][] =spiralOrderElement(n);
        printMatrix(matrix);
    }
}
