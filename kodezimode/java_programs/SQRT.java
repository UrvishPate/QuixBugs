package java_programs;
import java.util.*;
public class SQRT {
/**
 * Calculates the square root of a number using the Babylonian method.
 *
 * @param x       The number to calculate the square root of.
 * @param epsilon The precision of the result. The function will stop iterating when the difference between successive approximations is less than epsilon.
 * @return The square root of x, approximated to the precision specified by epsilon.
 */
public static double sqrt(double x, double epsilon) {
    double approx = x / 2d;
    while (Math.abs(x - approx) > epsilon) {
        approx = 0.5d * (approx + x / approx);
    }
    return approx;
}}