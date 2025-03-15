import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 3;
        // Block 2:
        int w = 7;
        // Block 3:
        int n = 10;
        // Block 4:
        int count1 = 0;
        // Block 5:
        int count2 = 0;
        // Block 6:
        if (h > w) {
            // Block 7:
            while (w > 0) {
                // Block 8:
                count1 += h;
                // Block 9:
                if (count1 >= n) {
                    // Block 10:
                    count2 += 1;
                    // Block 11:
                    break;
                }
                // Block 12:
                else {
                    // Block 13:
                    count2 += 1;
                    // Block 14:
                    w -= 1;
                }
            }
        }
        // Block 15:
        else {
            // Block 16:
            while (h > 0) {
                // Block 17:
                count1 += w;
                // Block 18:
                if (count1 >= n) {
                    // Block 19:
                    count2 += 1;
                    // Block 20:
                    break;
                }
                // Block 21:
                else {
                    // Block 22:
                    count2 += 1;
                    // Block 23:
                    h -= 1;
                }
            }
        }
        // Block 24:
        System.out.println(count2);
        // Block END.
    }
    }
}
