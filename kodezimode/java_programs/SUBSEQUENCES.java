package java_programs;
import java.util.*;
public class SUBSEQUENCES {
/**
 * Generates all subsequences of length k from the range of integers between a and b.
 *
 * @param a The start of the range.
 * @param b The end of the range.
 * @param k The length of the subsequences.
 * @return An ArrayList of ArrayLists, each containing a subsequence of length k.
 */
public static ArrayList<ArrayList> subsequences(int a, int b, int k) {
    if (k == 0) {
        return new ArrayList();
    }

    ArrayList ret = new ArrayList(50);
    for (int i=a; i<b+1-k; i++) {
        ArrayList base = new ArrayList(50);
        for (ArrayList rest : subsequences(i+1, b, k-1)) {
            rest.add(0,i);
            base.add(rest);
        }
        ret.addAll(base);

    }

    return ret;
}}