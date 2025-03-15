import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 20, n = 3;
        // Block 2:
        int[] A = {4, 5, 6};
        // Block 3:
        int attack = 0;
        for (int value : A) {
            attack += value;
        }
        // Block 4:
        if (h > attack) {
            // Block 5:
            System.out.println("No");
        // Block 6:
        } else {
            // Block 7:
            System.out.println("Yes");
        }
        // Block END.
    }
    }

