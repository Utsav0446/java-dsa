
import java.util.Scanner;

public class BinaryToDecimal {
    static int toDeci(int a){
        int deci = 0;
        int power = 1;
        while(a >0){
            deci = deci+ ((a%10)*power);
            power *= 2;
            a /= 10;
        }
        return deci;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int x = toDeci(bin);
        System.out.println(x);
    }
}
