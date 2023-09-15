package java_programs;
import java.util.*;
public class REVERSE_LINKED_LIST {
/**
 * Reverses a linked list.
 *
 * @param node The head of the linked list to reverse.
 * @return The head of the reversed linked list.
 */
public static Node reverse_linked_list(Node node) {
    Node prevnode = null;
    Node nextnode;
    while (node != null) {
        nextnode = node.next;
        node.next = prevnode;
        prevnode = node;
        node = nextnode;
    }
    return prevnode;
}}
class Node {
Node next;}