
import java.util.Scanner;

public class DecimalToBinary  {

    public static int Binary(int a){
        int bi = 0;
        int unit = 1;
        while(a>0){
            int rem = a%2;
            bi = bi+(rem*unit); 
            unit *=10;
            a /= 2;
        }
        return bi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = Binary(n);
        System.out.println(b);
    }
}