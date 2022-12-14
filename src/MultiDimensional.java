import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        float[][] matrix1 = new float[3][3];
        float[][] matrix2 = {{1,2,3}, {4,5,6},{7,8,9}};

        float[][] triangle = new float[10][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new float[i + 1];
        }

        float[] numbers = {1,2,3,4,5};

        System.out.println(Arrays.toString(matrix2[1]));

        // iterate example 1
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // iterate example 2
        for (float[] row : matrix2) {
            for (float element : row) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        System.out.println(" --- UTIL Methods --- ");

        // util methods
        String[] words = {"Hello", "Monkey"};
        System.out.println(Arrays.toString(words));

        String[][] sentences = {{"Good", "Morning!"}, {"How", "are", "you?"}};
        System.out.println("Deep String: " + Arrays.deepToString(sentences));

        String[][] sentences2 = {{"Good", "Morning!"}, {"How", "are", "you?"}};
        System.out.println("Deep Equals: " + Arrays.deepEquals(sentences,sentences2));

        System.out.println();
        System.out.println(" --- Copying Methods --- ");

        int[][] num1 = {{1,2,3}, {4,5,6}};
        int[][] num2 = num1.clone();
        System.out.println("Doesn't work: " + num2);

        // Deep Copy

        int[][] num3 = new int[num1.length][];
        for (int i = 0; i < num1.length; i++) {
            num3[i] = new int[num1[i].length];
            for (int j = 0; j < num1[i].length; j++) {
                num3[i][j] = num1[i][j];
            }
        }
        System.out.println("New copy: " + Arrays.deepToString(num3));
        System.out.println("num1 = num3?: " + Arrays.deepEquals(num3, num1));


    }
}
