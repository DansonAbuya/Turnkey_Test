import java.util.Collections;
import java.util.List;

public class Largest_Difference {
    // The main function and the entry point to the program
    public static void main(String[] args) {

        List<Integer> inputNumbers = List.of(11, 12, 13,14, 15);
        int large_diff = find_max_diff(inputNumbers);
        System.out.println("Largest difference is: " + large_diff);
    }
    // The function that finds the larges difference in the list
    public static int find_max_diff(List<Integer> list) {
        // Check if the number of elements in the list is less than 2
        if (list.size() < 2) {
            return 0;
        }

        // maximum and minimum values from the list
        int max_Value = Collections.max(list);
        int min_Value = Collections.min(list);

        // return the largest difference

        return max_Value - min_Value;
    }


}
