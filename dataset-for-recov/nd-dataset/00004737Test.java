import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String charStr = "xyz";
        // Block 2:
        int length = charStr.length();
        // Block 3:
        System.out.println(String.format("%s%d%s", charStr.charAt(0), length - 2, charStr.charAt(length - 1)));
        // Block END.
    }
    }

