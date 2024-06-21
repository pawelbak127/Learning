public class RomanNumeralsEncoder {

    /*
                Symbol    Value
            I          1
            V          5
            X          10
            L          50
            C          100
            D          500
            M          1,000

     */

    public static String conversion(int n) {
        int modulo = 0;
        int howMany = 0;

        StringBuilder romanianNumeral = new StringBuilder();
        if (n>3999){
            System.out.println("We support only value from 1 to 3999");
        } else {
            // Checking how many thousands we have in this number.
            modulo = n%1000;
            howMany = n/1000;

            romanianNumeral.repeat("M",howMany);

            howMany = modulo/100;
            modulo = modulo%100;
            switch (howMany) {
                case 1:             romanianNumeral.append("C"); break;
                case 2:             romanianNumeral.append("CC"); break;
                case 3:             romanianNumeral.append("CCC"); break;
                case 4:             romanianNumeral.append("CD"); break;
                case 5:             romanianNumeral.append("D"); break;
                case 6:             romanianNumeral.append("DC"); break;
                case 7:             romanianNumeral.append("DCC"); break;
                case 8:             romanianNumeral.append("DCCC"); break;
                case 9:             romanianNumeral.append("CM"); break;
            }
            howMany = modulo/10;
            modulo = modulo%10;
            switch (howMany) {
                case 1:             romanianNumeral.append("X"); break;
                case 2:             romanianNumeral.append("XX"); break;
                case 3:             romanianNumeral.append("XXX"); break;
                case 4:             romanianNumeral.append("XL"); break;
                case 5:             romanianNumeral.append("L"); break;
                case 6:             romanianNumeral.append("LX"); break;
                case 7:             romanianNumeral.append("LXX"); break;
                case 8:             romanianNumeral.append("LXXX"); break;
                case 9:             romanianNumeral.append("XC"); break;
            }
            howMany = modulo;
            switch (howMany) {
                case 1:             romanianNumeral.append("I"); break;
                case 2:             romanianNumeral.append("II"); break;
                case 3:             romanianNumeral.append("III"); break;
                case 4:             romanianNumeral.append("IV"); break;
                case 5:             romanianNumeral.append("V"); break;
                case 6:             romanianNumeral.append("VI"); break;
                case 7:             romanianNumeral.append("VII"); break;
                case 8:             romanianNumeral.append("VIII"); break;
                case 9:             romanianNumeral.append("IX"); break;
            }
        }
        return romanianNumeral.toString();
    }
}
