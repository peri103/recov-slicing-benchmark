import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "internationalization";
        // Block 2:
        String sin = s.substring(1, s.length() - 1);
        // Block 3:
        System.out.println(s.charAt(0) + String.valueOf(sin.length()) + s.charAt(s.length() - 1));
        // Block END.
    }
    }

