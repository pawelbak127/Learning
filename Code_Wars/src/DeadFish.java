//CodeWars 6kyu level

import static java.lang.Math.pow;
public class DeadFish {
    public static int[] parse(String data) {

        int tempResult = 0;
        int numberOfoIteration = 0;
        char[] dataChar =  data.toCharArray(); // Conversion data string to char array

        int length = (int) data.chars().filter(ch -> ch == 'o' ).count(); // Check how many 'o' is in our string. We set up length of result array
        int[] result = new int[length];

/*
Creation of loop to go through each sign and calculate result.
Under 'o' character we need to add result to out table.
 */
        for (char c : dataChar) {
            switch (c){
                case 'i': tempResult += 1; break;
                case 'd': tempResult -= 1; break;
                case 's': tempResult = (int) pow(tempResult, 2); break;
                case 'o':
                    result[numberOfoIteration] = tempResult;
                    numberOfoIteration +=1;
            }
        }
        return result;
    }
}