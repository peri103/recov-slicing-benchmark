import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1234567876";
        // Block 2:
        int d = 1000;
        // Block 3:
        for (int i = 0; i < s.length() - 2; i++) {
            // Block 4:
            if (Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753) < d) {
                // Block 5:
                d = Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753);
            }
        }
        // Block 6:
        System.out.println(d);
        // Block END.
    }
    }
}
