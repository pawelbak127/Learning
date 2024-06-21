import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

public class CountingCharacters {

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char currentCharacter : str.toCharArray()){
            charCountMap.put(currentCharacter, (int) str.chars().filter(Character -> Character == currentCharacter).count());
        }
        return charCountMap;
    }
}
