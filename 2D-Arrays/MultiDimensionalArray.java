import java.util.Scanner;

public class MultiDimensionalArray{

    static void printArray(int[][] arr2, int n , int m){
        
        for(int i=0; i<n ; i++){
            for(int j=0 ;j<m ; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter row of matrix : ");
        int r= sc.nextInt();
        System.out.print("Enter Column of matrix : ");
        int c= sc.nextInt();
        
        int arr[][]= new int[r][c];
        System.out.println("Enter "+r*c+" Element : ");
        for(int i=0 ; i<r ;i++){
            for(int j=0 ;j<c ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("arr Elements are : ");
        printArray(arr, r, c);

        
        int arr2[][]={{1,2,3},{2,3,4},{5,6,7},{9,8,3}};
        System.out.println("_____________________\n");
        System.out.println("arr2 Elements are :");
        printArray(arr2,3,3);
    }
}