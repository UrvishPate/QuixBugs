package java_programs;
import java.util.*;
public class GCD {
/**
 * Computes the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
 *
 * @param a The first integer.
 * @param b The second integer.
 * @return The greatest common divisor of a and b.
 */
public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    } else {
        return gcd(a % b, b);
    }
}}