//I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements.
//I'll appreciate for your help.
//P.S. Each array includes only integer numbers. Output is a number too.

public class ArrayPlusArray {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < arr1.length; i++){
            sum += arr1[i];
        }
        for(int j = 0; j < arr2.length; j++){
            sum1 += arr2[j];
        }
        sum2 = sum + sum1;

        return sum2;
    }

}
