import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "20";
        String b = "30";
        // Block 2:
        int c = Integer.parseInt(a) - (2 * Integer.parseInt(b));
        // Block 3:
        if (c >= 0) {
            // Block 4:
            System.out.println(c);
        }
        // Block 5:
        else {
            // Block 6:
            System.out.println(0);
        }
        // Block END.
    }
    }
}
