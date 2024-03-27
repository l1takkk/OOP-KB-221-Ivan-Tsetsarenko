import java.util.Arrays;

public class taskn12 {
    public static boolean[] getSumCheckArray(int[] arr) {
        boolean[] result = new boolean[arr.length];
        
        if (arr.length < 3) {
            return result;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == arr[i-1] + arr[i-2]) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] resultArray = getSumCheckArray(numbers);
        System.out.println("Результат: " + Arrays.toString(resultArray));
    }
}