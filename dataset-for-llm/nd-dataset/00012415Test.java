import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "akasaka";
        // Block 2:
        int b = a.length();
        // Block 3:
        int c = (b - 1) / 2;
        // Block 4:
        int d = (b + 3) / 2;
        // Block 5:
        if (a.substring(0, c).equals(a.substring(d - 1))) {
            // Block 6:
            System.out.println("Yes");
        // Block 7:
        } else {
            // Block 8:
            System.out.println("No");
        }
        // Block END.
    }
    }
}
