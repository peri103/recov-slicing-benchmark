import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "D"; 
        String b = "H";
        // Block 2:
        String p = a + b;
        // Block 3:
        String[] p1 = p.chars().distinct().mapToObj(c -> String.valueOf((char) c)).toArray(String[]::new);
        // Block 4:
        if (p1.length == 1) {
            // Block 5:
            System.out.println("H");
        // Block 6:
        } else {
            // Block 7:
            System.out.println("D");
        }
        // Block END.
    }
    }
}
