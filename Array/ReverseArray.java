package Array;

public class ReverseArray {
    static void swap(int[] arr,int i ,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return;
    }
    static void reverse(int[] arr){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        } 
    } 
    public static void main(String[] args) {
        int[] arr = {0,5,9,10,1};
        int k = 0;
        int n = arr.length-1;
        
        k = k % n; 
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        reverse(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}