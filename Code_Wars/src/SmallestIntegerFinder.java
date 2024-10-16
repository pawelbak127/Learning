import java.util.Arrays;
import java.util.OptionalInt;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        System.out.println(Arrays.stream(args).min().getAsInt());
        return Arrays.stream(args).min().getAsInt();
    }
}