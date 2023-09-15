package java_programs;
import java.util.*;
public class KTH {
/**
 * Returns the kth smallest element in an ArrayList of Integers.
 *
 * @param arr The ArrayList of Integers.
 * @param k   The position of the element to return, when the list is sorted in ascending order.
 * @return The kth smallest element in the list. If k is less than the number of elements smaller than the pivot, the function is called recursively on the list of elements smaller than the pivot. If k is greater than or equal to the number of elements smaller than or equal to the pivot, the function is called recursively on the list of elements greater than the pivot. If neither condition is met, the pivot is returned.
 */
public static Integer kth(ArrayList<Integer> arr, int k) {
        int pivot = arr.get(0);
        ArrayList<Integer> below, above;
        below = new ArrayList<Integer>(arr.size());
        above = new ArrayList<Integer>(arr.size());
        for (Integer x : arr) {
            if (x < pivot) {
                below.add(x);
            } else if (x > pivot) {
                above.add(x);
            }
        }

        int num_less = below.size();
        int num_lessoreq = arr.size() - above.size();
        if (k < num_less) {
            return kth(below, k);
        } else if (k >= num_lessoreq) {
            return kth(above, k);
        } else {
            return pivot;
        }
    }}