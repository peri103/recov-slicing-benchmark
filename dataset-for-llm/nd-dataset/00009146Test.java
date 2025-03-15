import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "2017/01/07";
        // Block 2:
        String[] parts = s.split("/");
        String y = parts[0];
        String m = parts[1];
        String d = parts[2];
        // Block 3:
        System.out.println("2018/" + m + "/" + d);
        // Block END.
    }
    }
}
