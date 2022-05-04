//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//Complete the method which accepts such an array, and returns that single different number.
//The input array will always be valid! (odd-length >= 3)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheStray {

    static int stray(int[] numbers) {

        final List<Integer> collect = Arrays
                .stream(numbers)
                .distinct()
                .boxed()
                .collect(Collectors.toList());

        int frequencyCounter=0;
        for (int number : numbers) {
            if (number == collect.get(0)) {
                frequencyCounter++;
            }
        }
        if (frequencyCounter == 1) {
            return collect.get(0);
        }
        return collect.get(1);
    }
}
