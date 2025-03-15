import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "level";
        // Block 2:
        int b = a.length();
        // Block 3:
        double c = (b - 1) / 2.0;
        // Block 4:
        double d = (b + 1) / 2.0;
        // Block 5:
        if (a.substring(0, (int)c).equals(a.substring((int)d))) {
            // Block 6:
            System.out.println("Yes");
        // Block 7:
        } else {
            // Block 8:
            System.out.println("No");
        }
        // Block END.
    }
    }
}
