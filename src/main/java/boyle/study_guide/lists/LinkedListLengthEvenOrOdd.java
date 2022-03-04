package boyle.study_guide.lists;

import java.util.LinkedList;
import java.util.List;

/*
 * Geeks for Geeks Problem
 * Linked List Length Even or Odd Java Solution
 * Time Complexity = O(n)
 * Space Complexity = O(n)
 * */
public class LinkedListLengthEvenOrOdd {

    public static void main(String[] args) {
        // Assigned data contained in Nodes are irrelevant
        Node node = new Node(4);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        // Modify amount of "next" nodes to adjust whether even or odd
        node.next = node2;
        node2.next = node3;
        oddOrEvenLength(node);
    }

    private static String oddOrEvenLength(Node head) {
        int count = 0;
        Node current = head;
        while (current != null){
            current = current.next;
            count++;
        }
        return oddOrEvenString(count % 2);
    }

    private static String oddOrEvenString(int value){
        if (value == 0){
            System.out.println("Even");
            return "Even";
        } else {
            System.out.println("Odd");
            return "Odd";
        }
    }

    private static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
}
