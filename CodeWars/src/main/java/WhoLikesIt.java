// You probably know the "like" system from Facebook and other pages. People can "like" blog posts
// , pictures or other items. We want to create the text that should be displayed next to such an item.

// Implement the function which takes an array containing the names of people that like an item.
//   It must return the display text as shown in the examples:

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        String whoLikes = "";

        if (names.length < 1 || names == null) {
            whoLikes = "no one likes this";
        }

        for (int i = 0; i < names.length; i++) {

            int numMoreThan4 = 0;

            if (names.length == 1) {
                whoLikes = names[i] + " likes this";
            } else if (names.length == 2) {
                whoLikes = names[0] + " and " + names[1] + " like this";
            } else if (names.length == 3) {
                whoLikes = names[0] + ", " + names[1] + " and " + names[2] + " like this";
            } else {
                numMoreThan4 = names.length - 2;
                whoLikes = names[0] + ", " + names[1] + " and " + numMoreThan4 + " others like this";
            }

        } return whoLikes;
    }

}
