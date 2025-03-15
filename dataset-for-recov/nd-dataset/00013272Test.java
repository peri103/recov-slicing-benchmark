import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "haiku,atcoder,tasks";
        // Block 2:
        String b = a.replace(",", " ");
        // Block 3:
        System.out.println(b);
        // Block END.
    }
    }
}
