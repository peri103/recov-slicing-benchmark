import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 6;
        // Block 2:
        int[] a_l = {1, 2, 3, 2, 2, 1};
        // Block 3:
        int ans = 1;
        // Block 4:
        Boolean is_plus = null;
        // Block 5:
        java.util.ArrayList<Integer> sub = new java.util.ArrayList<>();
        // Block 6:
        for (int i : a_l) {
            // Block 7:
            if (sub.size() == 0) {
                // Block 8:
                sub.add(i);
                // Block 9:
                continue;
            }
            // Block 10:
            if (sub.get(sub.size() - 1) == i) {
                // Block 11:
                sub.add(i);
                // Block 12:
                continue;
            }
            // Block 13:
            if (is_plus == null) {
                // Block 14:
                if (sub.get(sub.size() - 1) > i) {
                    // Block 15:
                    is_plus = false;
                }
                // Block 16:
                else {
                    // Block 17:
                    is_plus = true;
                }
                // Block 18:
                sub.add(i);
            }
            // Block 19:
            else if (is_plus) {
                // Block 20:
                if (sub.get(sub.size() - 1) > i) {
                    // Block 21:
                    sub = new java.util.ArrayList<>();
                    sub.add(i);
                    // Block 22:
                    ans += 1;
                    // Block 23:
                    is_plus = null;
                }
                // Block 24:
                else {
                    // Block 25:
                    sub.add(i);
                }
            }
            // Block 26:
            else {
                // Block 27:
                if (sub.get(sub.size() - 1) < i) {
                    // Block 28:
                    sub = new java.util.ArrayList<>();
                    sub.add(i);
                    // Block 29:
                    ans += 1;
                    // Block 30:
                    is_plus = null;
                }
                // Block 31:
                else {
                    // Block 32:
                    sub.add(i);
                }
            }
        }
        // Block 33:
        System.out.println(ans);
        // Block END.
    }
    }
}
