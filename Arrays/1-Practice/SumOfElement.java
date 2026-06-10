public class SumOfElement {


    static int printsum(int [] arr, int target ){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }

    
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        System.out.println("Ans is : "+printsum(arr, 60));
    }
}
