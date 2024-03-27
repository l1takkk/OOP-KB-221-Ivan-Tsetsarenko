import java.util.Scanner;

public class taskn5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of feet the snail climbs per day (a):");
        int a = scanner.nextInt();
        System.out.println("enter the number of feet the snail climbs per night (b):");
        int b = scanner.nextInt();
        System.out.println("enter the height of the tree in feet (h):");
        int h = scanner.nextInt();
        int days = (h - b - 1) / (a - b) + 1;
        if (a >= h) {
            System.out.println("1");
        } else if (a <= b) {
            System.out.println("Impossible");
        } else {
            System.out.println(days);
        }
    }
}