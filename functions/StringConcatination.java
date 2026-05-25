package functions;

import java.util.Scanner;

public class StringConcatination {

    public static String greet(String name){
        return ("Hello " + name +"!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(greet(s));
    }
}
