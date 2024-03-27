import java.util.Arrays;

public class taskn14 {
    public static void cycleSwap(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }
    public static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length <= 1 || shift <= 0 || shift >= array.length) {
            return;
        }
        int[] temp = Arrays.copyOfRange(array, array.length - shift, array.length);
        
        for (int i = array.length - 1; i >= shift; i--) {
            array[i] = array[i - shift];
        }
        System.arraycopy(temp, 0, array, 0, shift);
    }
    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 7, 4};
        cycleSwap(array1);
        System.out.println("array after cycleSwap: " + Arrays.toString(array1));
        int[] array2 = {1, 3, 2, 7, 4};
        cycleSwap(array2, 3);
        System.out.println("array after cycleSwap with shift 3: " + Arrays.toString(array2));
    }
}