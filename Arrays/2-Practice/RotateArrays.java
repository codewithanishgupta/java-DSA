public class RotateArrays {
     static void printArrays(int [] arr){
        int n= arr.length;
        for(int i=0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int [] rotate(int []arr,int k){
        int n=arr.length;
        k=k%n;
        int [] ans = new int[n];
        int j=0;

        for(int i=n-k ; i<n ;i++){
            ans[j++]=arr[i];
        }

        for(int i=0 ;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println("original arrays.");
        printArrays(arr);
        int [] ans =rotate(arr, 101);
        System.out.println("\nRotate");
        printArrays(ans);
    }
}
