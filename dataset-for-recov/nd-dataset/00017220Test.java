import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "H"; String b = "H";
        // Block 2:
        System.out.println(new String[]{"D", "H"}[a.equals(b) ? 1 : 0]);
        // Block END.
    }
    }

