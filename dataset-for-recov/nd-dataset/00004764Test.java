import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "xyz";
        // Block 2:
        int l = s.length() - 2;
        // Block 3:
        System.out.print(s.charAt(0));
        System.out.print(l);
        System.out.print(s.charAt(l + 1));
        // Block END.
    }
    }

