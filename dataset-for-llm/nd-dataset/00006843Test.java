import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 210, N = 5;
        // Block 2:
        int[] lists = {31, 41, 59, 26, 53};
        // Block 3:
        java.util.Arrays.sort(lists);
        // Block 4:
        int SAM = 0;
        for (int num : lists) {
            SAM += num;
        }
        // Block 5:
        if (SAM >= H) {
            // Block 6:
            System.out.println("Yes");
        // Block 7:
        } else {
            // Block 8:
            System.out.println("No");
        }
        // Block END.
    }
    }
}
