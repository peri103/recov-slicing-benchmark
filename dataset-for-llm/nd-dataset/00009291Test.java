import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "2017/01/31";
        // Block 2:
        char[] sArray = s.toCharArray();
        // Block 3:
        sArray[3] = '8';
        // Block 4:
        System.out.print(String.valueOf(sArray));
        // Block END.
    }
    }
}
