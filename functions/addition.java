package functions;

import java.util.Scanner;

public class addition {

    static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int p = sum(x,y,z);

        System.out.println("Sum of three no. is : "+p);
    }
}
