import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 20, N = 3;
        // Block 2:
        int[] A = {4, 5, 6};
        // Block 3:
        int Total_attack = 0;
        for (int attack : A) {
            Total_attack += attack;
        }
        // Block 4:
        if (H - Total_attack <= 0) {
            // Block 5:
            System.out.println("Yes");
        // Block 6:
        } else {
            // Block 7:
            System.out.println("No");
        }
        // Block END.
    }
    }

