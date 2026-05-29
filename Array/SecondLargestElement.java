package Array;

import java.util.Scanner;

public class SecondLargestElement {

    static int Secondlargest(int arr[] ,int n){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!= max1){
                max2 = arr[i];
            }
        }
        if(max1 == Integer.MIN_VALUE ){
            return -1;
        }
        return max2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int second = Secondlargest(arr,n);
        System.out.println(second);
        sc.close();
    }
}
