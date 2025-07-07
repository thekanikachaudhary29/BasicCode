import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortingArray {
    public static void main(String[] args) {
     Integer array[] = {50,20,10,30,12};
     System.out.println("Array elements are :" + Arrays.toString(array));
     //sorting in ascending order
     Arrays.sort(array);
     System.out.println("Ascending Sorting elements are " +Arrays.toString(array));

     //sorting in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Descending sorting elements are " +Arrays.toString(array));
    }
}
