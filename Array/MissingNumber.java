package Array;

import java.util.*;

public class MissingNumber {

    static ArrayList<Integer> missingNum(int[] arr,int n){
        ArrayList<Integer> result = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] freq = new int[max+1];
        for(int i = 0;i<n;i++){
            freq[arr[i]]++;
        }

        for(int i = 0;i<freq.length;i++){
            if(freq[i]==0){
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,9};
        int n = arr.length;
        ArrayList<Integer>  al= missingNum(arr, n);
        System.out.println(al);
    }
}