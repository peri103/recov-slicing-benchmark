import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        if (N % 2 != 0) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int fives = 0;
            // Block 6:
            int power = 0;
            // Block 7:
            while (Math.pow(5, power + 1) <= N) {
                // Block 8:
                power++;
            }
            // Block 9:
            for (int i = 1; i <= power; i++) {
                // Block 10:
                fives += N / (int) Math.pow(5, i) / 2;
            }
            // Block 11:
            System.out.println(fives);
        }
        // Block END.
    }
    }

