import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 211, N = 5;
        // Block 2:
        int[] A = {31, 41, 59, 26, 53};
        // Block 3:
        String ans = "No";
        // Block 4:
        int sum_ = 0;
        for (int num : A) {
            sum_ += num;
        }
        // Block 5:
        if (H <= sum_) {
            // Block 6:
            ans = "Yes";
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }
}
