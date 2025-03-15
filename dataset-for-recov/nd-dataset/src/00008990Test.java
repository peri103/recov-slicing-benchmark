import org.junit.jupiter.api.Test;

class _00008990Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 1;
        // Block 2:
        int b = 2;
        // Block 3:
        int c = 4;
        // Block 4:
        int d = 8;
        // Block 5:
        int e = 9;
        // Block 6:
        int k = 15;
        // Block 7:
        int[] S = {a, b, c, d, e};
        // Block 8:
        int max = S[0];
        int min = S[0];
        for (int value : S) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        if ((max - min) <= k) {
            // Block 9:
            System.out.println("Yay!");
        } else {
            // Block 10:
            // Block 11:
            System.out.println(":(");
        }
        // Block END.
    }
    }

