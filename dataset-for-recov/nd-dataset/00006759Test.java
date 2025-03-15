import org.junit.jupiter.api.Test;

class _00006759Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int HP = 210, N = 5;
        // Block 2:
        int[] ATK = {31, 41, 59, 26, 53};
        // Block 3:
        System.out.println((sum(ATK) >= HP) ? "Yes" : "No");
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

