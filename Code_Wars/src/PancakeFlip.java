import java.util.*;

public class PancakeFlip {
    public static List<Integer> flipPancakes(List<Integer> stack) {

        List<Integer> sortedStack = new ArrayList<>(stack);
        sortedStack.sort(null);

        List<Integer> solution = new ArrayList<>();
        int counter =0;

        if (stack.size() == 1 || stack.equals(sortedStack)) { return solution;}

        for (int i = sortedStack.size()-1; i >0 ; i--) {
                counter++;
                System.out.println("--------------------------------------------------------" + counter + "--------------------------------------------------------");

                if (Objects.equals(sortedStack.get(i), stack.getLast())) { // Removing last position on the list when last is the largest value of the list
                    stack.removeLast();
                    System.out.println("SOLUTION LIST: " + solution);
                    System.out.println("STACK LIST " + stack);


                } else if (Objects.equals(sortedStack.get(i), stack.getFirst())) { // Reversing the list when the largest value is at the beginning


                    Collections.reverse(stack);
                    solution.add(stack.size() - 1);
                    stack.removeLast();
                    System.out.println("SOLUTION LIST: " + solution);
                    System.out.println("STACK LIST " + stack);

                }else{
                    System.out.println("STACK LIST: " + stack);
                    stack.indexOf(sortedStack.get(i)); // Retrieves the index of the largest number in the list
                    solution.add(stack.indexOf(sortedStack.get(i)));
                    System.out.println("STACK LIST: " + stack);
                    System.out.println(sortedStack.get(i));
                    System.out.println(stack.indexOf(sortedStack.get(i)));


                    Collections.reverse(stack.subList(0,stack.indexOf(sortedStack.get(i))+1));
                    System.out.println("STACK LIST: " + stack);
                    solution.add(stack.size() - 1);
                    Collections.reverse(stack);
                    System.out.println("STACK LIST: " + stack);
                    stack.removeLast();

                    System.out.println("SOLUTION LIST: " + solution);
                    System.out.println("STACK LIST " + stack);
            }
        }
        return solution; // Return an empty list
    }
}