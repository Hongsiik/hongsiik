import java.util.Scanner;
enum Command {ADD, LIST, SUM, AVG, STD, QUIT, INVALID}

public class ArrayEnum {
    public static void main(String[] args){
        int index = 0;
        final int[] values = new int[100];
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final Command command = getCommand(scanner); // Command is enum
            if (command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case AVG:
                    System.out.printf("%.2f%n", getAvg(values, index));
                    break;
                case SUM:
                    System.out.printf("%d%n", getSum(values, index));
                    break;
                case STD:
                    System.out.printf("%.2f%n", getStd(values, index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
            }
        }
        scanner.close();
    }
    private static Command getCommand(Scanner scanner){
        final String a = scanner.next().toUpperCase();
        try {
            return Command.valueOf(a);
        }   catch (IllegalArgumentException e){
            return Command.INVALID;
        }

    }

    private static int getValue(final Scanner sc){
        return sc.nextInt();
    }

    private static void printList(int[] values, int index){
        for (int i = 0; i < index; i++) {
            System.out.print(values[i]);
            if (i == index-1)
                System.out.println();
            else
                System.out.print(" ");
        }
    }
    private static double getAvg(int[] values, int index){
        double sum = 0.00;
        for (int i = 0; i < index; i++){
            sum += values[i];
        }
        return sum/index;
    }
    private static int getSum(int[] values, int index){
        int sum = 0;
        for (int i = 0; i < index; i++){
            sum += values[i];
        }
        return sum;
    }
    private static double getStd(int[] values, int index){
        double sum = 0.00, sum_1 = 0.00;
        for (int i = 0; i < index; i++){
            sum += values[i];
        }
        double avg = sum/index;
        for (int i = 0; i < index; i++){
            sum_1 += Math.pow(values[i]-avg, 2);
        }

        return Math.pow(sum_1/index, 0.5);
    }
}