import java.util.Scanner;

public class taskn3 {
    private static final int password = 2077;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("password:");
        int inputPassword = scanner.nextInt();
        if (inputPassword == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}