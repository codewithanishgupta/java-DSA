
import java.util.Scanner;

public class AdditionOfMatrix {

    static void printArray(int[][] arr, int n , int m){
        
        for(int i=0; i<n ; i++){
            for(int j=0 ;j<m ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void sumOfMatrix(int[][] arr1 , int r1 , int c1 ,int[][] arr2 , int r2, int c2){
        int[][] sum = new int[r1][c1];
        if(r1 != r2 || c2 != c2){
            System.out.println("Worng input - Adition not possible");
            return;
        }else{
            for(int i=0 ; i<r1; i++){
                for(int j=0 ; j<c1 ; j++){
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
        }
        printArray(sum, r1, c1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows & Column of Matrix first : ");
        int r1= sc.nextInt();
        int c1=sc.nextInt();
        int [][] a = new int[r1][c1];
        System.out.println("Enter matrix "+r1*c1+" Element : ");
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c1 ; j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter Number of Rows & Column of Matrix Second : ");
        int r2= sc.nextInt();
        int c2=sc.nextInt();
        int [][] b = new int[r2][c2];
        System.out.println("Enter matrix "+r2*c2+" Element : ");
        for(int i=0 ; i<r2 ; i++){
            for(int j=0 ; j<c2 ; j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("First matrix : ");
        printArray(a, r1, c1);
        System.out.println("Second matrix : ");
        printArray(b, r2, c2);

        System.out.println("------------------------------");
        System.out.println("After Addition Matrix is : ");
        sumOfMatrix(a,r1,c1,b,r2,c2);
    }
}
