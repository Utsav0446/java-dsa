package Pattern;

public class Stairs {
    public static void main(String[] args) {
        // int steps = 5;
        
        // for(int i =1;i<=(steps*2);i++){
        //     for(int j = 1;j<=i;j+=2){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int n = 5;
        int stars = 2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            if(i%2 ==0){
                stars +=2;
            }
            System.out.println();
        }
    }
}
