import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number:");
        double number = input.nextDouble();
        double result = 0;

        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println(result);


    }
}
