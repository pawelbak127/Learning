import java.util.Arrays;
/*Description:
Pyramids are amazing! Both in architectural and mathematical sense. If you have a computer, you can mess with pyramids even if you are not in Egypt at the time. For example, let's consider the following problem. Imagine that you have a pyramid built of numbers, like this one here:

   /3/
  \7\ 4
 2 \4\ 6
8 5 \9\ 3
Here comes the task...
Let's say that the 'slide down' is the maximum sum of consecutive numbers from the top to the bottom of the pyramid. As you can see, the longest 'slide down' is 3 + 7 + 4 + 9 = 23

Your task is to write a function that takes a pyramid representation as an argument and returns its largest 'slide down'. For example:

* With the input `[[3], [7, 4], [2, 4, 6], [8, 5, 9, 3]]`
* Your function should return `23`.
By the way...
My tests include some extraordinarily high pyramids so as you can guess, brute-force method is a bad idea unless you have a few centuries to waste. You must come up with something more clever than that.

(c) This task is a lyrical version of Problem 18 and/or Problem 67 on ProjectEuler.

My approach
We are going from before last row to the top.
For the first value from the second-to-last line, we select two values directly below. From these values, we choose the higher one and add it.
For example:
For number 2 we choose 8 and 5. We checked that 8 is higher, so we add it to 2. Finally, we got 10. The same for other values in this row.
   /3/                      /3/                 /3/             23  - This is final value. The longest slide down from pyramid.
  \7\ 4              ->    \7\ 4        ->    \20\19    ->
 2 \4\ 6                 10 \13\ 15
8 5 \9\ 3

 */
public class PyramidSlideDown {
    public static int findMaxPathSum(int[][] pyramid) {
        // Start from the second last row and move upwards
        for (int i = pyramid.length - 2; i >= 0; i--) {
            // Printing last row
            System.out.println(Arrays.toString(pyramid[i+1]));
            for (int j = 0; j < pyramid[i].length; j++) {
                 //For each element, consider the two elements directly below.
                pyramid[i][j] += Math.max(pyramid[i+1][j], pyramid[i+1][j+1]);
            }
        }
        // The top element now contains the maximum total from top to bottom
        System.out.println(pyramid[0][0]);
        return pyramid[0][0];
    }
}