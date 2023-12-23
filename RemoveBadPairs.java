
import java.util.ArrayList;

public class RemoveBadPairs {

    public static void removeBadPairs(ArrayList<Integer> list) {
        int size = list.size();

        // Iterate through the list in pairs (skipping the last element if the size is odd)
        for (int i = 0; i < size - 1; i += 2) {
            if (i % 2 == 1 && list.get(i) > list.get(i + 1)) {
                // Remove "bad" pairs
                list.remove(i);
                list.remove(i);
                // Adjust index to account for removal
                i -= 2;
                size -= 2;
            }
        }

        // If the list has an odd length, remove the last element
        if (size % 2 == 1) {
            list.remove(size - 1);
        }
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(5);
        numbers.add(8);
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);
        numbers.add(1);

        removeBadPairs(numbers);
        System.out.println(numbers);  // Output should be [3, 7, 5, 5, 4, 7]
    }
}