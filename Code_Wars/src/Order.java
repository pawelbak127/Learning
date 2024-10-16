import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    public static String order(String words) {


        if (words == ""){
            return "";
        }
        String[] wordsArray = words.split(" ");
        String[] tempWordsArray = new String[wordsArray.length];
        StringBuilder result = new StringBuilder();
            for (String word : wordsArray){
                char[] tempCharArray = word.toCharArray();

                for (int i = 0; i < tempCharArray.length; i++) {
                    if(Character.isDigit(tempCharArray[i])){
                        tempWordsArray[Character.getNumericValue(tempCharArray[i])-1] = word;
                    }
                }
            }

        for (String word : tempWordsArray) {
            if (word != null) {
                result.append(word).append(" ");
            }
        }
        result.deleteCharAt(result.length()-1);

        System.out.println(result.toString());
        return result.toString();
    }
}