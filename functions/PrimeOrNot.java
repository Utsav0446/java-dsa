package functions;

import java.util.Scanner;

public class PrimeOrNot {

    static boolean prime (int n){
        if(n==1) return true;
        for(int i=2;i<=n/i;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean result = prime(n);

        System.out.println(result);
        if(result){
            System.out.println("Number "+n+" is prime");
        }
        else{
            System.out.println("Number "+n+" is not prime.");
        }
    }
}
