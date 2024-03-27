import java.util.Scanner;

public class taskn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter an integer:");
        int inputSeconds = scanner.nextInt();

        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;

        System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);
    }
}