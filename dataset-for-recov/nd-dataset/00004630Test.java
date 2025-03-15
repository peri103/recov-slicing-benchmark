import org.junit.jupiter.api.Test;

class _00004630Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "internationalization";
        // Block 2:
        System.out.println(String.format("%s%d%s", s.substring(0, 1), (s.length() - 2), s.substring(s.length() - 1)));
        // Block END.
    }
    }

