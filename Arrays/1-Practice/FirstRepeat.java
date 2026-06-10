import java.util.Scanner;

class FirstRepeat{


    static int repeated(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.println("First repeated Number is : "+repeated(arr));
    }
}