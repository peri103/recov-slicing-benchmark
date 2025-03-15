import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String h = "20"; 
        String n = "3";
        // Block 2:
        String[] a = {"4", "5", "6"};
        // Block 3:
        int attack = 0;
        // Block 4:
        for (int i = 0; i < Integer.parseInt(n); i++) {
            // Block 5:
            attack += Integer.parseInt(a[i]);
        }
        // Block 6:
        if (Integer.parseInt(h) - attack <= 0) {
            // Block 7:
            System.out.println("Yes");
        // Block 8:
        } else {
            // Block 9:
            System.out.println("No");
        }
        // Block END.
    }
    }

