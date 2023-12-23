
import java.util.ArrayList;

public class ArrayListSwitchPairs {

    public static void switchPairs(ArrayList<String> list) {
        int size = list.size();

        // Iterate through the list in pairs and switch their positions
        for (int i = 0; i < size - 1; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<String> words1 = new ArrayList<>();
        words1.add("four");
        words1.add("score");
        words1.add("and");
        words1.add("seven");
        words1.add("years");
        words1.add("ago");

        switchPairs(words1);
        System.out.println(words1);

        ArrayList<String> words2 = new ArrayList<>();
        words2.add("to");
        words2.add("be");
        words2.add("or");
        words2.add("not");
        words2.add("to");
        words2.add("be");
        words2.add("hamlet");

        switchPairs(words2);
        System.out.println(words2);
    }
}