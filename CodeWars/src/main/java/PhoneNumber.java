// Write a function that accepts an array of 10 integers (between 0 and 9)
//   , that returns a string of those numbers in the form of a phone number.



public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        var phone = "(xxx) xxx-xxxx";
        for (int n : numbers) {
            phone = phone.replaceFirst("x", n + "");
        }
        return phone;
    }
}
