import jdk.dynalink.Operation;

import java.sql.SQLOutput;
import java.util.*;

public class Nowaczek {
    public static List<Integer> flipPancakes(List<Integer> stack) {

        List<Integer> sortedStack = new ArrayList<>(stack);
        sortedStack.sort(null);

        List<Integer> solution = new ArrayList<>();

        for (int i = sortedStack.size()-1; i >0 ; i--) {

            if (Objects.equals(sortedStack.get(i), stack.get(stack.size()-1))) {
                stack.remove(stack.size()-1);
                i--;
            } if (Objects.equals(sortedStack.get(i), stack.get(0))) {

                Collections.reverse(stack);
                solution.add(stack.size() - 1);
                stack.remove(0);
                i--;

            }else{
                stack.indexOf(sortedStack.get(i)); // Pobieramy index gdzie znajduje się największa liczba
                solution.add(stack.indexOf(sortedStack.get(i)));

                Collections.reverse(stack.subList(0,stack.indexOf(sortedStack.get(i))+1));
                solution.add(stack.size() - 1);
                Collections.reverse(stack);
                stack.remove(stack.size()-1);
            }
        }
        return List.of(); // Return an empty list
    }
}