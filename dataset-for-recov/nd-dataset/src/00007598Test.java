import org.junit.jupiter.api.Test;

class _00007598Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 20, n = 3;
        // Block 2:
        int[] a = {4, 5, 6};
        // Block 3:
        System.out.println((sum(a) >= h) ? "Yes" : "No");
        // Block END.
    }

    private static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }
    }

