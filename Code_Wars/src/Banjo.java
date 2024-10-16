public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        String solution = "Nope";
        Character first = name.toLowerCase().charAt(0);
        if (first == 'r'){
            System.out.println(name + " plays banjo");
            return name + " plays banjo";
        }else {
            System.out.println(name + " does not play banjo");
            return name + " does not play banjo";
        }
    }
}