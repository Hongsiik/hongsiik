import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a begin number: ");
        int begin = scanner.nextInt();
        System.out.print("Enter an end number: ");
        int end = scanner.nextInt();


        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,3d%n", begin, end, product);



    }

    private static long getSumBetween(int a, int b) {
        int S = 0;
        for (int i = a; i <= b; i++){
            S += i;
        }
        return S;
    }
    private static long getProductBetween(int a, int b){
        int P = 1;
        for (int j = a; j <= b; j++){
            P *= j;
        }
        return P;
    }

}
