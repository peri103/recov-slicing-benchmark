import org.junit.jupiter.api.Test;

class _00008264Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 3, k = 3;
        // Block 2:
        int[] a = {1, 2, 3};
        // Block 3:
        int ans = 1;
        // Block 4:
        n -= k;
        // Block 5:
        k -= 1;
        // Block 6:
        if (n % k == 0) {
            // Block 7:
            ans += n / k;
        }
        // Block 8:
        else {
            // Block 9:
            ans += n / k + 1;
        }
        // Block 10:
        System.out.println(ans);
        // Block END.
    }
    }

