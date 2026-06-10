// 

import java.util.Scanner;

public class Q2 {

    static void printArray(int [] arr){
        int n = arr.length;
        System.out.print("Array Element are : ");
        for(int i= 0 ;i<n ;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int smallestArray(int [] arr){
        int n=arr.length;
        int small=Integer.MAX_VALUE;
        for(int i=0 ;i<n ;i++){
            if(arr[i]<small)
                small=arr[i];
        }
        return small;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the how many element in an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter "+n+" element : ");
        for(int i=0; i<arr.length ; i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        System.out.println("\n Smallest element in an arrays is : "+smallestArray(arr));
    }
}
