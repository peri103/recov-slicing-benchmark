import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "xyz";
        // Block 2:
        int size = s.substring(1, s.length() - 1).length();
        // Block 3:
        System.out.println(s.charAt(0) + String.valueOf(size) + s.charAt(s.length() - 1));
        // Block END.
    }
    }
}
