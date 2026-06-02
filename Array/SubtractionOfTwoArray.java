package Array;

import java.util.Scanner;

public class SubtractionOfTwoArray {
    static int[] sub(int[] arr1,int[] arr2,int x,int y){
        int maxSize = Math.max(x,y);
        int[] result = new int[maxSize];
        
        int k = maxSize-1;
        int i = arr1.length-1;
        int j = arr2.length-1;
        while(i>=0 && j>=0){
            if(arr1[i] > arr2[j]){
                result[k] = arr1[i] -arr2[j];
            }else{
                result[k] = 10+arr1[i]-arr2[j];
                arr1[i-1] -= 1;
            }
            i--;
            j--;
            k--;
        }
        while (i >= 0) {
            result[k] = arr1[i];
            i--;
            k--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int[] a = new int[x];
        for(int i=0;i<x;i++){
            a[i] = sc.nextInt();
        }

        int y = sc.nextInt();
        int[] b = new int[y];
        for(int i=0;i<y;i++){
            b[i] = sc.nextInt();
        }

        int[] subArr = sub(a,b,x,y);

        if(subArr[1] ==0){
            for(int i = 1;i<subArr.length;i++){
                System.out.print(subArr[i]+" ");
            }
        }else{
            for(int i = 0;i<subArr.length;i++){
                System.out.print(subArr[i]+" ");
            }
        }       
        sc.close();
    }
}