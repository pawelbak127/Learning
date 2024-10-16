import java.util.Arrays;
import java.util.List;
public class FindLast {
    public static <T> T last(final List<T> list) {
        System.out.println(list.get(list.size() - 1));
        return list.get(list.size() - 1);
    }

    public static char last(final String string) {
        int length = string.length() - 1;
        System.out.println(string.charAt(length));
        return string.charAt(length);
    }

    @SafeVarargs
    public static <T> T last(final T... list) {
        List<T> tempList = Arrays.asList(list);  // Tworzy Arrays$ArrayList
        return tempList.get(tempList.size() - 1); // Zwraca ostatni element
    }
}
