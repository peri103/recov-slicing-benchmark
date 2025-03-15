import org.junit.jupiter.api.Test;

class _00009000Test {
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
        int[] List = {a, b, c, d, e};
        // Block 8:
        for (int i = 0; i < List.length; i++) {
            // Block 9:
            for (int j = i + 1; j < List.length; j++) {
                // Block 10:
                if (List[j] - List[i] > k) {
                    // Block 11:
                    System.out.println(":(");
                    // Block 12:
                    System.exit(0);
                }
            }
        }
        // Block 13:
        System.out.println("Yay!");
        // Block END.
    }
    }

