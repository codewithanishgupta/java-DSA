// 3.Write a program to calculate the sum of all elements in an array. 

import java.util.Scanner;

public class Q3 {

    static void printArray(int [] arr){
        int n= arr.length;
        System.out.print("Elements are : ");
        for(int i=0 ; i<n ;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int sumArray(int [] arr){
        int n= arr.length;
        int sum =0;
        for(int i=0 ; i<n ;i++){
           sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of arrays : ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter "+n+" Element  : ");
        for(int i=0 ;i<n ; i++){
            arr[i]=sc.nextInt();
        }

        printArray(arr);
        System.out.println("\n Sum of array element : "+sumArray(arr));
    }
}
