package functions;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static float cTof(float c){
        float f = (c*(9/5))+32;
        return f;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float celsius = sc.nextFloat();

        float fahrenheit = cTof(celsius);

        System.out.println(fahrenheit);
    }
}
