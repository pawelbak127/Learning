import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWars {
    public static void main(String[] args){
        //Running symulation of  Greed Game
        int [] dice = {5,5,5,2,1};
        //Greed.greedy(dice);

        //Running calculation of longest slide down from pyramid
        int[][] test = new int[][]{{75},
                {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10},
                {20, 4, 82, 47, 65},
                {19, 1, 23, 75, 3, 34},
                {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
                {41, 41, 26, 56, 83, 40, 80, 70, 33},
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23},
        };
        //PyramidSlideDown.findMaxPathSum(test);


        List<String> JosephusArray = new ArrayList<>(List.of("s", "5", "b", "H", "d", "34234", "p", "l", "n", "r"));
        //JosephusPermutation.josephusPermutation(JosephusArray, 3);
        String test1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //AlphanumericTest.alphanumeric(test1);

        Object[] haystack = { "junk", "more junk", new String("needle"), "gadget" };
        //FindingWord.findNeedle(haystack);
        //RomanNumeralsEncoder.conversion(1666 );
        //CountingCharacters.count("kokos");

        //LargeFactorials.Factorial(16);


        List<Point> points = Arrays.asList(
                new Point(2, 2), //A
                new Point(2, 8), //B
                new Point(5, 5), //C
                new Point(6, 3), //D
                new Point(6, 7), //E
                new Point(7, 4), //F
                new Point(7, 9)  //G
        );

        //DeadFish.parse("iiisdosodddddiso");

        int[] numbers = {1, 3, 5, 9, -11};
        //FirstNonRepeatingChar.firstNonRepeatingLetter("moonmoon");

        //SmallestIntegerFinder.findSmallestInt(numbers);
        //FindLast.last("NOWAK");
        //Order.order("is2 Thi1s T4est 3a");
        //Banjo.areYouPlayingBanjo("Robert");
        final List<Integer> case1 = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 4));
        PancakeFlip.flipPancakes(case1);
    }



}
