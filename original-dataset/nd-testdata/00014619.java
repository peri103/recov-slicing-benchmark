import java.util.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 3, P = 0;
        // Block 2:
        Scanner scanner = new Scanner(System.in);
        int[] A = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // Block 3:
        int odds = 0, evens = 0;
        // Block 4:
        for (int i : A) {
            // Block 5:
            if ((i & 1) == 1) {
                // Block 6:
                odds += 1;
            }
            // Block 7:
            else {
                // Block 8:
                evens += 1;
            }
        }
        // Block 9:
        BigInteger fo = factorial(odds);
        // Block 10:
        if (P == 0) {
            // Block 11:
            BigInteger ans = BigInteger.ZERO;
            // Block 12:
            // Block 13:
            for (int r = 0; r <= odds; r += 2) {
                // Block 14:
                ans = ans.add(fo.divide(factorial(odds - r).multiply(factorial(r))));
            }
            // Block 15:
            ans = ans.multiply(BigInteger.valueOf(2).pow(evens));
            // Block 16:
        } else {
            // Block 17:
            BigInteger ans = BigInteger.ZERO;
            // Block 18:
            // Block 19:
            for (int r = 1; r <= odds; r += 2) {
                // Block 20:
                ans = ans.add(fo.divide(factorial(odds - r).multiply(factorial(r))));
            }
            // Block 21:
            ans = ans.multiply(BigInteger.valueOf(2).pow(evens));
        }
        // Block 22:
        System.out.println(ans);
        // Block END.
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
