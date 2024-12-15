import java.util.Scanner;

public class SimpleMathOperations {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        double z = 4.5d;
        float d = 5.543f;

        //simple arithmetics operations with int
        int sum = x + y;
        int diff = x - y;
        int div = x / y;
        int mult = x * y;
        //simple arithmetics operations with int double and float

        double res1 = z + y;
        int res2 = y + (int) z;
        double res3 = d / z;
        float res4 = d - y;

        double overflow = Double.MAX_VALUE * Float.MAX_VALUE;

        //simple logic operations
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();

       if(age<13){
           System.out.println("child");
       }else if(age>=13 && age<20){
           System.out.println("teenager");
       }else if(age>=20 && age<=66){
           System.out.println("work hard");
       }


    }
}
