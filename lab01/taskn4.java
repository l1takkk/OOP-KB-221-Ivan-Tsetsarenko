import java.util.Scanner;

public class taskn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("unknown amount:");
        int numberOfStrangers = scanner.nextInt();

        if (numberOfStrangers <= 0) {
            System.out.println("number of strangers must be greater than 0.");
        } else {
            scanner.nextLine();

            for (int i = 1; i <= numberOfStrangers; i++) {
                System.out.println("name?" + i + ":");
                String name = scanner.nextLine();
                System.out.println("Hello, " + name);
            }
        }
    }
}