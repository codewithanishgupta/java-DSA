

public class ReverseArrays {

    static void printArrays(int [] arr){
        int n= arr.length;
        for(int i=0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void swapValue(int [] arr , int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse(int [] arr ){
        int n= arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            swapValue(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,81};
        reverse(arr);
        printArrays(arr);
        
    }
}
