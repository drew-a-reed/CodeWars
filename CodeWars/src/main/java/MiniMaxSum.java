/*Given five positive integers, find the minimum and maximum values that can be
        calculated by summing exactly four of the five integers. Then print the
        respective minimum and maximum values as a single line of
        two space-separated long integers.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int lowestInt = arr.get(0);
        int highestInt = arr.get(0);
        long sumLarge = 0;
        long sumSmall = 0;

        for (Integer number : arr) {

            if (number > highestInt) {
                highestInt = number;
            } else if (number < lowestInt) {
                lowestInt = number;
            }
        }
        arr.remove(new Integer(lowestInt));
        for (Integer number : arr){
            sumLarge += number;
        }
        arr.add(new Integer(lowestInt));
        arr.remove(new Integer(highestInt));
        for (Integer number : arr){
            sumSmall += number;
        }
        System.out.println(sumSmall + " " + sumLarge);

    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
