import org.junit.jupiter.api.Test;

class _00015375Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 12, y = 3, z = 1;
        // Block 2:
        int[] divmodResult = divmod(x, y + z);
        int ans = divmodResult[0];
        int mod = divmodResult[1];
        // Block 3:
        if (mod >= z) {
            // Block 4:
            System.out.println(ans);
        }
        // Block 5:
        else {
            // Block 6:
            System.out.println(ans - 1);
        }
        // Block END.
    }

    public static int[] divmod(int x, int y) {
        return new int[]{x / y, x % y};
    }
    }

