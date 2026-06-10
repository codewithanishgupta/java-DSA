import java.util.Scanner;

public class FindUniqNumber {
    
    static int findArray (int [] arr){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){

                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
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
        System.out.println("Uniq Number is : "+findArray(arr));
    }
}
