import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 10, n = 3;
        // Block 2:
        int[] a = {4, 5, 6};
        // Block 3:
        System.out.println((sum(a) < h) ? "No" : "Yes");
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

