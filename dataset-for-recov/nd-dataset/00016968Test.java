import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "H"; 
        String b = "H"; 
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
        } else {
            // Block 5:
            // Block 6:
            System.out.println("D");
        }
        // Block END.
    }
    }
}
