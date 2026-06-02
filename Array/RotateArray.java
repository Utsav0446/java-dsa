package Array;

public class RotateArray {
    static void revArr(int[] arr,int k ){
        int n = arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        k  = k%arr.length;
        for(int num : arr) {
            System.out.print(num +" ");
        }
        System.out.println();
        revArr(arr, k);
        for(int num : arr) {
            System.out.print(num +" ");
        }
    
    }
}
