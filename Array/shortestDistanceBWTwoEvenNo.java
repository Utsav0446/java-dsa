// Write a program to find out the shortest distance between two even positive integers in an array arr and print the distance. If there is one or zero even positive integer in the array then return -1.
package Array;

import java.util.Scanner;

public class shortestDistanceBWTwoEvenNo {
    static int solution(int arr[]){
        int x = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 ==0){
                x= i;
                break;
            }
        }
        
        if(x == -1){
            return -1;
        }
        
        int min = Integer.MAX_VALUE;
        for(int i= x+1;i<arr.length;i++){
            if(arr[i]%2==0){
                if(min>(i-x)){
                    min = i-x;
                }else{
                    x = i;
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int y = solution(arr);

        System.out.println(y);
    }
}
