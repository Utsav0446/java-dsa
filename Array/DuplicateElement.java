package Array;
import java.util.Scanner;

// You have been given an array arr that might contain duplicate elements. Your task is to find the maximum possible distance between occurrences of two repeating elements i.e. elements having the same value. If there are no duplicate elements in the array, print 0

public class DuplicateElement{

    static int repeatingMax(int[] arr,int n){
        int result = 0;
        for(int i = 0;i<n;i++){
            int search = arr[i];
            for(int j = i+1;j<n;j++){
                if(arr[j]==search){
                    result = Math.max(j-i, result);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = repeatingMax(arr,n);
        System.out.println(x);

    }
}