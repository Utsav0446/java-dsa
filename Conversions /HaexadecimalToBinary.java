
import java.util.Scanner;

public class HaexadecimalToBinary {

    static int hexaToBin(String s){
        int result = 0;
        for(int i= s.length();i>=0;i++){
            char ch = s.charAt(i);
            int digit =0;
            if(ch-'a'>=0 && ch-'a'<=9){
                digit = ch-'a';
            }
            else if(ch>='A' && ch<='Z'){
                digit= ch-'A'+10;
            }

            int power = 1;
            while(digit>0){
                int remainder = digit % 2;
                result = result+(remainder*power);
                power *= 2;
                digit /= 2; 
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int decimal = hexaToBin(s);
        System.out.println(decimal);
    }
}
