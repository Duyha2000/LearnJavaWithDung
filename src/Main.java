import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));
        array.sort(Collections.reverseOrder());
        Collections.reverse(array);

        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
