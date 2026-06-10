// 1.Write a program to find the largest element in an array. 

import java.util.Scanner;

class LargestArray{

    static void printArray(int [] arr){
        int n = arr.length;
        System.out.print("Array Element are : ");
        for(int i= 0 ;i<n ;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int largeArray(int [] arr){
        int n=arr.length;
        int larger=Integer.MIN_VALUE;
        for(int i=0 ;i<n ;i++){
            if(arr[i]>larger)
                larger=arr[i];
        }
        return larger;
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
        System.out.println("\n Largest element in an arrays is : "+largeArray(arr));
    }
}