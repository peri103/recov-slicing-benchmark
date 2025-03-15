import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int k = 101;
        // Block 2:
        int rep = 0;
        // Block 3:
        int f = 0;
        // Block 4:
        for (int i = 0; i < k; i++) {
            // Block 5:
            rep = rep * 10 + 7;
            // Block 6:
            if (rep % k == 0) {
                // Block 7:
                f = 1;
                // Block 8:
                break;
            }
            // Block 9:
            rep = rep % k;
        }
        // Block 10:
        System.out.println(f == 0 ? -1 : (i + 1));
        // Block END.
    }
    }
}
