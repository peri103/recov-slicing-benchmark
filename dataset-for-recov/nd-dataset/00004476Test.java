import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "xyz";
        // Block 2:
        char first = s.charAt(0);
        // Block 3:
        char end = s.charAt(s.length() - 1);
        // Block 4:
        int strCount = s.length() - 2;
        // Block 5:
        System.out.println(String.format("%c%d%c", first, strCount, end));
        // Block END.
    }
    }

