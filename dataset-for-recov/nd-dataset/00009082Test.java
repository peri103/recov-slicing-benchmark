import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "2017/01/07";
        // Block 2:
        String b = a.substring(0, 3) + "8" + a.substring(4);
        // Block 3:
        System.out.println(b);
        // Block END.
    }
    }
}
