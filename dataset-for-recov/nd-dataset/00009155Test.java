import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String dateString = "2017/01/31";
        // Block 2:
        System.out.println("2018/01/" + dateString.substring(dateString.length() - 2));
        // Block END.
    }
    }

