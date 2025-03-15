import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int inp1 = 3, inp2 = 0;
        // Block 2:
        int[] c = {1, 1, 1};
        // Block 3:
        int add = 0;
        for (int num : c) {
            add += num;
        }
        // Block 4:
        int ans;
        if (add != 0) {
            // Block 5:
            ans = (int) Math.pow(2, inp1 - 1);
        } else {
            // Block 6:
            ans = (int) Math.pow(2, inp1) * (1 - inp2);
        }
        // Block 8:
        System.out.println(ans);
        // Block END.
    }
    }

