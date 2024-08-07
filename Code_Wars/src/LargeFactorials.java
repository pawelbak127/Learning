import java.math.BigInteger;

public class LargeFactorials {

    public static String Factorial(int n) {

        BigInteger factorial = BigInteger.valueOf(1);
        for (int i =1; i<=n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return String.valueOf(factorial);
    }
}
