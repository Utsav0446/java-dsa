
import java.util.Scanner;


public class OcatalToBinary {
    static int Oct(int a){
        int result =0;
        int power = 1;
        while(a > 0){
            result = result +((a%10)*power);
            power *= 8;
            a /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = Oct(n);
        System.out.println(x);
    }
}
