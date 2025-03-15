import org.junit.jupiter.api.Test;

class _00016970Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "D"; 
        String b = "D";
        // Block 2:
        String[][] ok = {{"H", "H"}, {"D", "D"}};
        // Block 3:
        boolean found = false;
        for (String[] pair : ok) {
            if (pair[0].equals(a) && pair[1].equals(b)) {
                found = true;
                break;
            }
        }
        if (found) {
            // Block 4:
            System.out.println("H");
        // Block 5:
        } else {
            // Block 6:
            System.out.println("D");
        }
        // Block END.
    }
    }

