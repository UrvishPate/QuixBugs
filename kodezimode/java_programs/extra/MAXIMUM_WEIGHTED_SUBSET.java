package java_programs.extra;
public class MAXIMUM_WEIGHTED_SUBSET {
/**
 * Finds the maximum total weight of a subset of the given weights that does not exceed the bound.
 *
 * This function uses dynamic programming to solve the 0/1 knapsack problem.
 *
 * @param weights The array of weights.
 * @param bound The maximum total weight that the subset can have.
 * @return The maximum total weight of a subset of the given weights that does not exceed the bound.
 */
public static int maxSubsetWeight(int[] weights, int bound) {
    if (weights.length == 0) {
        return 0;
    }
    int[][] maxWeight = new int[weights.length][bound];
    for (int w = 0; w <= bound; w++)
        maxWeight[0][w] = weights[0] <= w ? weights[0] : 0;

    for (int i = 1; i < weights.length; i++) {
        for (int w = 0; w <= bound; w++) {
            if (weights[i] > w) {
                maxWeight[i][w] = maxWeight[i-1][w];
            } else {
                int include = weights[i] + maxWeight[i-1][w - weights[i]];
                int exclude = maxWeight[i-1][w];
                maxWeight[i][w] = Math.max(include, exclude);
            }
        }
    }
    return maxWeight[weights.length-1][bound];
}}