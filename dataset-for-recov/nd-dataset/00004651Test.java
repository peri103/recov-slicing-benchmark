import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "internationalization";
        // Block 2:
        int a = s.length() - 2;
        // Block 3:
        char[] m = s.toCharArray();
        // Block 4:
        System.out.println(m[0] + "" + a + "" + m[m.length - 1]);
        // Block END.
    }
    }

