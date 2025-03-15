import org.junit.jupiter.api.Test;

class _00006707Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 10, N = 3;
        // Block 2:
        int[] A = {4, 5, 6};
        // Block 3:
        System.out.println(H <= sum(A) ? "Yes" : "No");
        // Block END.
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }
    }

