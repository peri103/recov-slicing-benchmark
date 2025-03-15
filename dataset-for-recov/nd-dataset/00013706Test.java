import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h1 = 10, m1 = 0, h2 = 12, m2 = 0, k = 120;
        // Block 2:
        int total = (h2 - h1) * 60;
        // Block 3:
        if (m1 <= m2) {
            // Block 4:
            total += (m2 - m1);
        }
        // Block 5:
        else {
            // Block 6:
            if (m2 == 0) {
                // Block 7:
                total += 60 - m1;
                // Block 8:
                total -= 60;
            }
            // Block 9:
            else {
                // Block 10:
                total -= (m1 - m2);
            }
        }
        // Block 11:
        int ans = total - k;
        // Block 12:
        System.out.println(ans);
        // Block END.
    }
    }

