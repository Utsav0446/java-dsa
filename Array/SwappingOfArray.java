package Array;
public class SwappingOfArray {

    static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x= 0;
        int y= arr.length-1;
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        swap(arr,x,y);
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
