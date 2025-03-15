import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "D"; String b = "H";
        // Block 2:
        a = a.equals("H") ? "1" : "-1";
        // Block 3:
        b = b.equals("H") ? "1" : "-1";
        // Block 4:
        System.out.println((Integer.parseInt(a) * Integer.parseInt(b) == 1) ? "H" : "D");
        // Block END.
    }
    }
}
