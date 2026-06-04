package Array;

public class FindTriplets {
    static void triplets(int[] arr,int n){
        System.out.println("Geometric triplets for the following are  : ");
        for(int i = 1;i<n-1;i++){
            int j = i-1;
            while(j>=0){
                int k = i+1;
                while(k<n){
                    if(arr[i]*arr[i] == arr[j]*arr[k]){
                        System.out.println("(" + arr[i] + " " + arr[j] + " " + arr[k] + " ) ");
                    }
                    k++;
                }
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,8,10,15,16,30,32,64};
        int n = arr.length;
        triplets(arr,n);
    }
}
