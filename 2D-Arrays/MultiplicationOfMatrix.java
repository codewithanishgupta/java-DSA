import java.util.Scanner;

public class MultiplicationOfMatrix {

    static void printArray(int[][] arr, int n , int m){
        
        for(int i=0; i<n ; i++){
            for(int j=0 ;j<m ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a,int r1 , int c1 , int[][] b, int r2,int c2){
        if (c1 != r2){
            System.out.println("Multiplication is not possible - worng input");
            return;
        }else{
            int [][] mul =new int[r1][c2];
            for(int i=0; i<r1 ; i++){
                for(int j=0 ; j<c2 ; j++){
                    mul[i][j]=0;
                    for(int k=0 ; k<r1 ; k++){
                        mul[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            printArray(mul, r1, c2);
        }
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
        System.out.println("After Multiplication Matrix is : ");
        multiply(a,r1,c1,b,r2,c2);
    }
    
}
