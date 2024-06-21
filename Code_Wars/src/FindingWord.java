public class FindingWord {

    public static String findNeedle(Object[] haystack) {
        int position = 0;
        for (int i = 0; i < haystack.length; i++) {
            System.out.println(haystack[i]);
            if (haystack[i] != null && haystack[i].equals("needle")){
                position = i;
            }
        }
        System.out.println("found the needle at position " + position);
        return "found the needle at position " + position;
    }
}
