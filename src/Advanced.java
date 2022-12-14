import java.time.LocalDate;
import java.util.*;

public class Advanced {
    public static void main(String[] args) {
        String text = String.format("Hello %s, today is %s", "World", LocalDate.now().getDayOfWeek());
        System.out.println(text);

        int result = sum(1,2,3,4,5,6,7,8,9);
        System.out.println(result);

        // Conversions - array to list
        String[] array = {"one", "two", "three"};
        List<String> list = Arrays.asList(array);
        System.out.println("Array to List: " + list);
        List<String> array2 = Arrays.asList("one", "two", "three");
        System.out.println("List as array: " + array2);

        list.set(0, "twelve");
        System.out.println("Original array is changed: " + Arrays.toString(array));
        array[0] = "one";
        System.out.println("Reverse of previous: " + list);

        // Conversions - list to array
        List<String> list2 = new ArrayList<>();
        list2.add("four");
        list2.add("five");
        list2.add("six");

        Object[] array3 = list2.toArray();
        String[] array4 = list2.toArray(new String[0]);

        list2.add("four");
        array4[0] = "twenty";

        System.out.println("List: " + list2);
        System.out.println("Array from list: " + Arrays.toString(array4));

        // Conversions - sets
        String[] array5 = {"one", "two", "three", "four"};

        // takes values then sorts alphabetically
        Set<String> set = new TreeSet<>(Arrays.asList(array5));
        System.out.println("Set from Array: " + set);

        // retains the alpha order
        String[] array6 = set.toArray(new String[0]);
        System.out.println("Array from set: " + Arrays.toString(array6));

        // Sub-Typing


    }

    // Vargs
    static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
