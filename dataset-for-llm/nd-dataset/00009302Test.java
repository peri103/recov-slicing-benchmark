import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "2017"; String b = "01"; String c = "07";
        // Block 2:
        int n = Integer.parseInt(a);
        // Block 3:
        n += 1;
        // Block 4:
        System.out.printf("%d/%s/%s%n", n, b, c);
        // Block END.
    }
    }
}
