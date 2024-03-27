import java.util.Scanner;
public class taskn1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row:");
        String inputString = scanner.nextLine();
        System.out.println("Hello, " + inputString);
        scanner.close();
    }
}