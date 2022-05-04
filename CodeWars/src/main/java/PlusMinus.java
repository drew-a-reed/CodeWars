/*Given an array of integers, calculate the ratios of its elements that are positive
        , negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
        Note: This challenge introduces precision problems. The test cases are scaled to six decimal places
        , though answers with absolute error of up to  are acceptable.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class PlusMinus1 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        Double positive = 0.0, negative = 0.0, zero = 0.0;
        for(Integer tempInt : arr){
            if(tempInt > 0){
                positive ++;
            } else if(tempInt == 0){
                zero ++;
            } else {
                negative ++;
            }
        }
        positive = positive / arr.size();
        negative = negative / arr.size();
        zero = zero / arr.size();
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinus1.plusMinus(arr);

        bufferedReader.close();
    }
}
