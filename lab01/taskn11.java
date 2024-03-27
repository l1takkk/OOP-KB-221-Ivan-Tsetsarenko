public class taskn11 {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {3, 2, 10, 5, 31};
        int evenSum = sum(numbers);
        System.out.println("sum of even numbers in the array: " + evenSum);
    }
}