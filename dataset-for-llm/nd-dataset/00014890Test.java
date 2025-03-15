import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 3;
        int p = 0;
        // Block 2:
        int[] a = {1, 1, 1};
        // Block 3:
        int odd = 0;
        // Block 4:
        int even = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            if (a[i] % 2 == 0) {
                // Block 7:
                even++;
            }
            // Block 8:
            else {
                // Block 9:
                odd++;
            }
        }
        // Block 10:
        int ans = 0;
        // Block 11:
        int t = 1;
        // Block 12:
        while (t <= odd) {
            // Block 13:
            BigInteger res = factorial(odd).divide(factorial(t).multiply(factorial(odd - t)));
            // Block 14:
            t += 2;
            // Block 15:
            if (even != 0) {
                // Block 16:
                int w = 0;
                // Block 17:
                while (w <= even) {
                    // Block 18:
                    BigInteger res1 = factorial(even).divide(factorial(w).multiply(factorial(even - w)));
                    // Block 19:
                    w++;
                    // Block 20:
                    ans += res.intValue() * res1.intValue();
                }
            }
            // Block 21:
            else {
                // Block 22:
                ans += res.intValue();
            }
        }
        // Block 23:
        if (p == 1) {
            // Block 24:
            System.out.println(ans);
        }
        // Block 25:
        else {
            // Block 26:
            System.out.println(Math.pow(2, n) - ans);
        }
        // Block END.
    }

    private static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    }
}
