import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        int num1;
        int num2;
        int result;

        Scanner calc = new Scanner(System.in);
        System.out.println("Enter first num");
        num1=calc.nextInt();
        System.out.println("Enter second num");
        num2=calc.nextInt();
        result = num1 * num2;
        System.out.println("The product is:\n" + result);
    }
}
