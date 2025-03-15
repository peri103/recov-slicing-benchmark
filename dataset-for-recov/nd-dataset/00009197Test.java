import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] date = {"2017", "01", "31"};
        // Block 2:
        date[0] = "2018";
        // Block 3:
        System.out.println(String.join("/", date));
        // Block END.
    }
    }

