import java.util.Scanner;

public class Main {

    static int RecursiveExp(int base, int exp) {

        if (exp == 0) {
            return 1;
        }

        int result = RecursiveExp(base, exp - 1) * base;
        return result;

    }

    public static void main(String[] args) {

        int base, exp, result;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        base = scan.nextInt();
        System.out.print("Enter the exponent value: ");
        exp = scan.nextInt();

        result = RecursiveExp(base, exp);
        System.out.println("Result: " + result);

    }
}
