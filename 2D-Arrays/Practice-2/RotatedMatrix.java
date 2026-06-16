import java.util.Scanner;

public class RotatedMatrix {

    static void printArray(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void trancposeINPlace(int[][] arr , int r , int c){  
        for(int i=0 ; i<c ; i++){
            for(int j=i ; j<r ; j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    static void reverseMatrix(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotatedMatrix(int[][] arr , int n){
        trancposeINPlace(arr, n, n);
        for (int i=0 ; i<n ; i++){
            reverseMatrix(arr[i]);
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

        System.out.println("After Rotated Matrix is : ");
        rotatedMatrix(arr, c);
        printArray(arr);
    }
}
