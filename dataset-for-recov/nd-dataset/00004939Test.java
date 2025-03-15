import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "internationalization";
        // Block 2:
        System.out.println(String.format("%s%d%s", s.charAt(0), s.length() - 2, s.charAt(s.length() - 1)));
        // Block END.
    }
    }

