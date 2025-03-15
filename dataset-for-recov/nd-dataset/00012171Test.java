import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "11"; String b = "16";
        // Block 2:
        String c = "11"; String d = "17";
        // Block 3:
        if (a.equals(c)) {
            // Block 4:
            System.out.println(0);
        }
        // Block 5:
        else {
            // Block 6:
            System.out.println(1);
        }
        // Block END.
    }
    }
}
