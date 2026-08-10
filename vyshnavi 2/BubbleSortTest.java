public class BubbleSortTest {

    // Method to compare two arrays
    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to display test result
    public static void runTest(int testNumber, int[] input, int[] expected) {
        BubbleSort.bubbleSort(input);

        System.out.print("Test " + testNumber + ": ");

        if (arraysEqual(input, expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.print("Expected: ");
        for (int value : expected) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Actual:   ");
        for (int value : input) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Bubble Sort Testbench");
        System.out.println("---------------------");

        // Test Case 1
        int[] input1 = {5, 3, 8, 4, 2};
        int[] expected1 = {2, 3, 4, 5, 8};
        runTest(1, input1, expected1);

        // Test Case 2
        int[] input2 = {10, 20, 30, 40, 50};
        int[] expected2 = {10, 20, 30, 40, 50};
        runTest(2, input2, expected2);

        // Test Case 3
        int[] input3 = {9, 7, 5, 3, 1};
        int[] expected3 = {1, 3, 5, 7, 9};
        runTest(3, input3, expected3);

        // Test Case 4
        int[] input4 = {4, 1, 4, 2, 1};
        int[] expected4 = {1, 1, 2, 4, 4};
        runTest(4, input4, expected4);
    }
}