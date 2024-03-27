public class taskn10 {

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = {9, 5, 7, 10, 1};
        int maxValue = max(numbers);
        System.out.println("maxValue is: " + maxValue);
    }
}