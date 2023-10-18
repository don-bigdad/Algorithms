package binarySearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearch {
    public static int binarySearch(int[] array, int item) {
        Arrays.sort(array);
        int high = array.length;
        int low = 0;
        int step = 0;
        int mid = (high + low) / 2;
        while (high >= low) {
            if (item > array[mid]) {
                low = mid;
            } else if (item < array[mid]) {
                high = mid;
            } else if (item == array[mid]) {
                return array[mid];
            }
            mid = (high + low) / 2;
            System.out.println(step++);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = IntStream.rangeClosed(0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,23));
    }
}
