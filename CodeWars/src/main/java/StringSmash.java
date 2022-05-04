import java.util.Arrays;
import java.lang.*;
import java.util.stream.Collectors;

public class StringSmash {


    public static String smash(String... words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i]).append(" ");
        }
        return String.valueOf(stringBuilder).trim();
    }
    public static String smash1(String... words) {
        String joinedString = Arrays.stream(words).collect(Collectors.joining());
        return joinedString;
    }



    public static void main(String[] args) {
        String[] words = new String[]{"Drew", "Reed", "Hero"};
        System.out.println(smash(words));

        System.out.println(smash1(words));
    }
}