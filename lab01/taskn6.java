import java.util.Scanner;

public class taskn6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the total bill amount:");
        int totalBill = scanner.nextInt();
        System.out.println("enter the number of friends:");
        int numberOfFriends = scanner.nextInt();
        if (totalBill <= 0) {
            System.out.println("total bill amount must be greater than 0.");
        } else if (numberOfFriends <= 0) {
            System.out.println("number of friends must be greater than 0.");
        } else {
            double totalAmountWithTip = totalBill * 1.1;
            double eachFriendPays = totalAmountWithTip / numberOfFriends;

            System.out.println("friend's share of the payment: " + (int) eachFriendPays);
        }
    }
}