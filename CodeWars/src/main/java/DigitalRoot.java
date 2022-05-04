// Digital root is the recursive sum of all the digits in a number.

// Given n, take the sum of the digits of n. If that value has more than one digit,
// continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer

public class DigitalRoot {
    public static int digital_root(int n) {
        int sum = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        while (sum > 9) {
            sum = String.valueOf(sum)
                    .chars()
                    .map(Character::getNumericValue)
                    .sum();
        }
        return sum;
    }
}
