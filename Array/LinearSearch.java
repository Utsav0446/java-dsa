package Array;

import java.util.Scanner;

public class LinearSearch {
    static int searchIndex(int[] arr,int a){
        int index =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == a){
                index = i;
                break;
            }
        }
        return index;
    }
    static boolean searchBool(int[] arr,int a ){
        boolean result = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == a){
                result = true;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to find: ");
        int x = sc.nextInt();

        boolean yesNo = searchBool(arr,x);
        int index = searchIndex(arr,x);

        System.out.println(yesNo);
        System.out.println(index);
    }
}
