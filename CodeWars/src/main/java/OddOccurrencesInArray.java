import java.util.Arrays;

public class OddOccurrencesInArray {


    public static int solution(int[] A) {
        int result = 0;

        for (int value : A) {
            result ^= value;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] testArray1 = {1};  // Only one element, should return 1
        int[] testArray2 = {4, 2, 4, 6, 6, 8, 8};  // Unpaired element is 2, should return 2
        int[] testArray3 = {3, 5, 7, 3, 5, 7, 9, 11, 9};  // Unpaired element is 11, should return 11
        int[] testArray4 = {2, 8, 2, 5, 5, 1, 8};  // Unpaired element is 1, should return 1
        int[] testArray5 = {-3, -3, -5, 1, -5};  // Unpaired element is 1, should return 1


        System.out.println("Test 1 Result: " + solution(testArray1));
        System.out.println("Test 2 Result: " + solution(testArray2));
        System.out.println("Test 3 Result: " + solution(testArray3));
        System.out.println("Test 4 Result: " + solution(testArray4));
        System.out.println("Test 5 Result: " + solution(testArray5));



    }
}


