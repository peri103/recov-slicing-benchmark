import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "haiku,atcoder,tasks";
        // Block 2:
        String l = String.join(" ", s.split(","));
        // Block 3:
        System.out.println(l);
        // Block END.
    }
    }

