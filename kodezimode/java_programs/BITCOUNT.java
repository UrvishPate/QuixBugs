package java_programs;
public class BITCOUNT {
/**
 * Counts the number of set bits (1s) in the binary representation of a given integer.
 *
 * @param n The integer to count set bits in.
 * @return The number of set bits in the binary representation of the given integer.
 */
public static int bitcount(int n) {
    int count = 0;
    while (n != 0) {
        n = (n ^ (n - 1));
        count++;
    }
    return count;
}}