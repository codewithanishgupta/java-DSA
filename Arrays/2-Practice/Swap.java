
import java.util.Scanner;


class ArrayDemo{

    Scanner sc= new Scanner(System.in);
    void Input(int[] arr,int n){
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }

    void show(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

//     void swapValue(int [] arr){
//     int n = arr.length;
//     for(int i = 0; i < n/2; i++){
//         int temp = arr[i];
//         arr[i] = arr[n - i - 1];
//         arr[n - i - 1] = temp;
//     }
// }


    void swapValue(int [] arr){
        int n= arr.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
   }
}



public class Swap {
    public static void main(String[] args) {
        ArrayDemo S = new ArrayDemo();
        System.out.print("Enter the how many element in an  Arrays :");
        int n=S.sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Input "+n+" Element in Arrays : ");
        S.Input(arr, n);
        System.out.print("Elements is : ");
        S.show(arr);

        S.swapValue(arr);
        System.out.print("After Swap : ");
        S.show(arr);
    }
}
