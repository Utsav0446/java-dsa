package functions;

import java.util.Scanner;

public class SecondLastDigitEvenOrNot {

    static boolean SecondLast(int n){
        n= n/10;
        int x = n%10;
        if(x%2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = SecondLast(n);
        if(result){
            System.out.println("true");
        }else{
            System.out.println("no");
        }
    }
}
