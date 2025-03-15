import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int isu = 12, hito = 3, sukima = 1;
        // Block 2:
        int ninzuu = 0;
        // Block 3:
        while (true) {
            // Block 4:
            int ans = isu / ((hito + sukima) * ninzuu + sukima);
            // Block 5:
            if (ans == 0) {
                // Block 6:
                break;
            }
            // Block 7:
            ninzuu = ninzuu + 1;
        }
        // Block 8:
        System.out.println(ninzuu - 1);
        // Block END.
    }
    }

