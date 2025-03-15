import org.junit.jupiter.api.Test;

class _00006683Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 10, M = 3;
        // Block 2:
        int[] A = {4, 5, 6};
        // Block 3:
        int a = 0;
        for (int num : A) {
            a += num;
        }
        // Block 4:
        String ans;
        if (a >= H) {
            // Block 5:
            ans = "Yes";
        // Block 6:
        } else {
            // Block 7:
            ans = "No";
        }
        // Block 8:
        System.out.println(ans);
        // Block END.
    }
    }

