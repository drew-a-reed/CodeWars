//Given an array of integers.
//Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
//If the input is an empty array or is null, return an empty array.
//Example
//For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

public class CountPositiveSumNegatives
{
    public static int[] countPositivesSumNegatives(int[] input) {
        int countOfPos = 0;
        int sumOfNeg = 0;
        int[] empt = new int[0];

        if (input == null || input.length<1){
            return empt;
        }

        for (int num : input) {
            if (num > 0) {
                countOfPos++;
            } else if (num < 0) {
                sumOfNeg += num;
            }
        }
        int[] ansArr = new int[]{countOfPos, sumOfNeg};

        return ansArr;
    }


}
