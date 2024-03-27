import java.util.Scanner;

public class taskn8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0, count = 0;
        System.out.println("enter numbers (enter 0 to complete):");
        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }
        if (count != 0) {
            double average = (double) sum / count;
            System.out.printf("avg value: %.2f", average);
        } else {
            System.out.println("no data :(");
        }
    }
}