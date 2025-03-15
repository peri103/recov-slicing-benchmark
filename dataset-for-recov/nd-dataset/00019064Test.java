import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 12;
        // Block 2:
        if (N % 2 != 0) {
            // Block 3:
            System.out.println(0);
            // Block 4:
            System.exit(0);
        }
        // Block 5:
        int cnt = 0;
        // Block 6:
        int current = 5;
        // Block 7:
        while (N / 2 >= current) {
            // Block 8:
            cnt += (N / 2 / current);
            // Block 9:
            current *= 5;
        }
        // Block 10:
        System.out.println(cnt);
        // Block END.
    }
    }

