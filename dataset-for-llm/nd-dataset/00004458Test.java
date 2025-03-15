import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "xyz";
        // Block 2:
        String mid = String.valueOf(s.length() - 2);
        // Block 3:
        System.out.println(s.charAt(0) + mid + s.charAt(s.length() - 1));
        // Block END.
    }
    }
}
