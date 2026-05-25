package functions;

import java.util.Scanner;

public class EvenAddByRecursionAndLoop  {

    public static int EvenSum(int a,int b){
        if(a>b){
            return 0;
        }
        // int sum =0;
        if(a%2 == 0){
            return a+EvenSum(a+1, b);
        }else{
            return EvenSum(a+1,b);
        }
    }

    public static int loopsum(int start,int end){
        int sum = 0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                sum +=i;
            }
        }
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int even = EvenSum(x, y);
        System.out.println(even);
        int loopadd = loopsum(x,y);
        System.out.println(loopadd);
    }
}
