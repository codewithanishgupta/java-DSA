
import java.util.Scanner;

public class TransposeMatrix{

    static void printArray(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] transposeOfMatrix(int[][] arr,int r ,int c){
        int matrix[][] = new int[c][r];
        for(int i=0 ; i<c ; i++){
            for(int j=0 ; j<r ; j++){
                matrix[i][j]=arr[j][i];
            }
        }
        return matrix;
    }

    static void trancposeINPlace(int[][] arr , int r , int c){  //in thish method only squre matrix transpose
        for(int i=0 ; i<c ; i++){
            for(int j=i ; j<r ; j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many row and column : ");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]= new int[r][c];
        System.out.println("Enter "+r*c+" element : ");
        for(int i=0 ;i<r ; i++){
            for(int j=0 ; j<c ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array Element : ");
        printArray(arr);
        System.out.println("After transpose matrix is : ");
        // int matrix[][]=transposeOfMatrix(arr, r, c);
        // printArray(matrix);
        trancposeINPlace(arr, r, c);
        printArray(arr);

    }
}