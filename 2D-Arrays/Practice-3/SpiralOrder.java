import java.util.Scanner;

class SpiralOrder {

    static void printMatrix(int [][] matrix){
       int  n=matrix.length;
       for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
       }
    }

    static void spiralOrderElement (int [][] matrix , int r , int c){
        int topRow = 0 , buttomRow = r-1 ,leftColumn = 0 , rightColumn=c-1  ;
        int totalElement = 0;
        
        while(totalElement < r*c){
            // topRow -> leftColumn to ReghtColumn
            for(int i = leftColumn ; i <= rightColumn && totalElement < r*c ; i++){
                System.out.print(matrix [topRow][i]+" ");
                totalElement ++ ;           

            }
            topRow ++; 

            // rightColumn -> topRow To buttomRow
            for(int j = topRow ; j <= buttomRow && totalElement < r*c ; j++){
                System.out.print(matrix[j][rightColumn]+" ");
                totalElement ++ ;

            }
            rightColumn --;

            // buttomRow -> rightColumn to leftColumn
            for(int i = rightColumn ; i >= leftColumn && totalElement < r*c ; i--){
                System.out.print(matrix[buttomRow][i]+" ");
                totalElement ++ ;

            }
            buttomRow --;

            // leftColumn -> buttomRow to topRow
            for(int j = buttomRow ; j >= topRow && totalElement < r*c ; j--){
                System.out.print(matrix[j][leftColumn]+" ");
                totalElement ++ ;

            }
            leftColumn ++;
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter how many row and column : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter "+(m*n)+" element : ");
        int [][] arr = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Original MAtrix is ");
        printMatrix(arr);

        System.out.println("Spiral Order ");
        spiralOrderElement(arr, n, m);
    }
}