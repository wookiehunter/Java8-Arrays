import java.util.Scanner;
import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] array = new int[4]; // specifying the length up front

        int[] array2 = new int[]{1,2,3,4,5};

        int[] array3 = {1,2,3,4,5};

        int[] array4 = {};

        String[] names = new String[4];
        names[0] = "Fred";
        System.out.println("Name 1 is " + names[0]);

        // Iterate
        for (int j : array3) {
            System.out.println(j);
        }

        // User specified
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter numbers: ");
//        int count = Integer.parseInt(scanner.nextLine());
//
//        int[] numbers = new int[count];
//        System.out.println(numbers.length);

        // Comparing arrays
        boolean result = Arrays.equals(array2, array3);

        // array methods
        int[] numbers1 = {12, 13, 999};

        int[] numbers2 = Arrays.copyOf(numbers1, 4);
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = Arrays.copyOfRange(numbers1,1,3);
        System.out.println(Arrays.toString(numbers3));

        int[] numbers4 = new int[9];
        System.arraycopy(numbers1, 0, numbers4, 0, 3);
        System.arraycopy(numbers2, 0, numbers4, 6, 3);
        System.out.println("Numbers 4: " + Arrays.toString(numbers4));

        Arrays.sort(numbers4);
        System.out.println("Sorted array" + Arrays.toString(numbers4));

        int index = Arrays.binarySearch(numbers4,  12);
        System.out.println("Found 12 at index: " + index);
    }
}