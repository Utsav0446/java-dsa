// Given two array of similar size , run a single loop and return a array which is summation of same index element,    0 <= element < 5
package Array;
import java.util.Scanner;

public class AdditionOfTwoArray {

    static int[] sum(int[] a,int[] b,int x,int y){
        int maxSize = Math.max(x,y);
        int[] result = new int[maxSize+1];
        int k = maxSize;
        int i = x-1;
        int j = y-1;

        int carry = 0;
        while(k >=0){
            int sum = carry;
            if(i>=0){
                sum += a[i];
                i--;
            }
            if(j>=0){
                sum += b[j];
                j--;
            }

            result[k] = sum%10;
            carry = sum/10;
            
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

        int[] sumArr = sum(a,b,x,y);

        if(sumArr[1] ==0){
            for(int i = 1;i<sumArr.length;i++){
                System.out.print(sumArr[i]+" ");
            }
        }else{
            for(int i = 0;i<sumArr.length;i++){
                System.out.print(sumArr[i]+" ");
            }
        }
        
        
        sc.close();
    }
}
