//First non-repeating character Level: 5kyu
public class FirstNonRepeatingChar {

    public static String firstNonRepeatingLetter(String s){

        char[] sChar = s.toCharArray();
        String sLowerCase = s.toLowerCase();
        char[] sCharLowerCase = sLowerCase.toCharArray();

        String result = "";

        for (int i = 0; i <sChar.length ; i++) {
            int finalI = i;

            int counter = (int) sLowerCase.chars().filter(ch -> ch == sCharLowerCase[finalI]).count(); // Counting quantity of character and mapping it into (int)

            if (counter <=1){

                result = String.valueOf(sChar[finalI]);
                System.out.println("Result is: " + result);
                break;
            }
        }
        return result;
    }
}
