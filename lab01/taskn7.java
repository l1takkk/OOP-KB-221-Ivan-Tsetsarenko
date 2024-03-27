import java.util.Scanner;

public class taskn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write your numbers:");
        int maxValue = Integer.MIN_VALUE; 
        while (true) {
            int currentValue = scanner.nextInt();
            if (currentValue == 0) {
                break; 
            }
            if (currentValue > maxValue) {
                maxValue = currentValue; 
            }
        }
        System.out.println("max number: " + maxValue);
        scanner.close();
    }
}