//Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.



public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
        if (str.length() == 0) return "";
        if (str.length() == 1) return str.concat("ay");
        int i = 0, j = i + 1;
        StringBuilder sb = new StringBuilder();

        while (j < str.length()) {
            if (str.charAt(j) == ' ') {
                sb.append(str.substring(i + 1, j)).append(str.substring(i, i + 1)).append("ay ");
                //str = str.substring(j+1);
                i = j + 1;
                j = i + 1;
            } else {
                j++;
            }
        }

        Character ch = new Character(str.charAt(i));
        if (Character.isAlphabetic(str.charAt(i))) {
            sb.append(str.substring(i + 1, j)).append(str.substring(i, i + 1)).append("ay");
            //str = str.substring(j+1);
            i = j + 1;
            j = i + 1;
        } else {
            sb.append(str.substring(i, j));
        }

        return sb.toString();
    }
}
