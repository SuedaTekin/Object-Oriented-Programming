import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomList {

    private Node head;

    public RandomList(int bounds, int size) {
        Set<Integer> usedValues = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomValue;
            do {
                randomValue = random.nextInt(bounds);
            } while (usedValues.contains(randomValue));

            usedValues.add(randomValue);
            Node newNode = new Node(randomValue);
            newNode.next = head;
            head = newNode;
        }
    }

    public void removeAdjacentDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void removeAdjacentDuplicatesR() {
        removeAdjacentDuplicatesRHelper(head);
    }

    private void removeAdjacentDuplicatesRHelper(Node current) {
        if (current == null || current.next == null) {
            return;
        }

        if (current.data == current.next.data) {
            current.next = current.next.next;
            removeAdjacentDuplicatesRHelper(current);
        } else {
            removeAdjacentDuplicatesRHelper(current.next);
        }
    }

    public int getMax() {
        int max = Integer.MIN_VALUE;
        Node current = head;
        while (current != null) {
            max = Math.max(max, current.data);
            current = current.next;
        }
        return max;
    }

    public void removeMaxValues() {
        int max = getMax();
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;

        while (current.next != null) {
            if (current.next.data == max) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        head = dummy.next;
    }
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        RandomList randomList = new RandomList(10, 10);
        System.out.println("Original List:");
        randomList.printList();

        randomList.removeAdjacentDuplicates();
        System.out.println("\nAfter removing adjacent duplicates iteratively:");
        randomList.printList();

        randomList = new RandomList(10, 10); // Re-create the list
        randomList.removeAdjacentDuplicatesR();
        System.out.println("\nAfter removing adjacent duplicates recursively:");
        randomList.printList();

        System.out.println("\nMax value: " + randomList.getMax());

        randomList.removeMaxValues();
        System.out.println("\nAfter removing max values:");
        randomList.printList();
    }
    private void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}



