import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "internationalization";
        // Block 2:
        int s_c = s.length() - 2;
        // Block 3:
        System.out.println(s.charAt(0) + String.valueOf(s_c) + s.charAt(s.length() - 1));
        // Block END.
    }
    }
}
