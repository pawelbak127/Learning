public class AlphanumericTest {

/*
Description:
In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.

The string has the following conditions to be alphanumeric:

At least one character ("" is not valid)
Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
No whitespaces / underscore
 */
    public static boolean alphanumeric(String s){

        /*
        ^ - The beginning of the string .
        [a-zA-Z0-9] - Each character which is uppercase lowercase and number from 0-9
        + - Character can appear once or more.
        $ - End of the string.
         */
        boolean check = s.matches( "^[a-zA-Z0-9]+$");
        System.out.println(check);
        return check;
    }
}
