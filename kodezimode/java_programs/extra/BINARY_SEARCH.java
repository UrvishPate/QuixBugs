package java_programs.extra;
import java.util.*;
public class BINARY_SEARCH {
/**
 * Finds the first occurrence of a specified value in a sorted array.
 *
 * @param arr The sorted array to search.
 * @param x   The value to find.
 * @return The index of the first occurrence of the specified value, or -1 if the value is not found.
 */
public static int findFirstInSorted(int[] arr, int x) {
    int lo = 0;
    int hi = arr.length;

    while (lo <= hi) {
        int mid = (lo + hi) / 2;

        if (x == arr[mid] && (mid == 0 || x != arr[mid - 1])) {
            return mid;
        } else if (x <= arr[mid]) {
            hi = mid;
        } else {
            lo = mid + 1;
        }
    }
    return -1;
}}