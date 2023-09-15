package java_programs;
import java.util.*;
public class WRAP {
/**
 * Main entry point of the application.
 *
 * @param args The command line arguments.
 */
public static void main(String[] args) {
    /**
     * Prints the last index of the character 'c' in the string "abc", starting the search at index 30.
     */
    System.out.println("abc".lastIndexOf("c",30));
}
public static ArrayList<String> wrap(String text, int cols) {
        ArrayList<String> lines = new ArrayList<String>();

        String line;
        while (text.length() > cols) {
            int end = text.lastIndexOf(" ", cols); // off by one?
            if (end == -1) {
                end = cols;
            }
            line = text.substring(0,end);
            text = text.substring(end);
            lines.add(line);
        }

        return lines;
    }}