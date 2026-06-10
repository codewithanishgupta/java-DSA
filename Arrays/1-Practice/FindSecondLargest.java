import java.util.Scanner;

public class FindSecondLargest {
    

    static int firstLarge(int [] arr){
        int n=arr.length;
        int large=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;
    }

    static int secLarge(int [] arr){
        int max=firstLarge(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
            int secmax=firstLarge(arr);
            return secmax;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter the range of Array : ");
        n= sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter "+n+" element of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second maximum Number is : "+secLarge(arr));
    }

}
