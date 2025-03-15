import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 10, N = 3;
        // Block 2:
        int[] A = {4, 5, 6};
        // Block 3:
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        System.out.println(sum >= H ? "Yes" : "No");
        // Block END.
    }
    }

