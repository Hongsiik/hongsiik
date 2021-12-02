import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("Factorial of "+i+" = "+getFactorial(i));



        }

    }

    private static long getFactorial(final int n) {
        if (n == 0){
            return 1;
        }
        else if (n == 1){
            return 1;
        }
        else
            return n*getFactorial(n-1);
    }
}
