import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] n = {"1", "1", "2"};
        // Block 2:
        if (n[1].compareTo(n[2]) < 0) n[1] = String.valueOf(Integer.parseInt(n[1]) + 1);
        // Block 3:
        if (n[0].compareTo(n[1]) < 0) n[0] = String.valueOf(Integer.parseInt(n[0]) + 1);
        // Block 4:
        System.out.println(n[0].repeat(3));
        // Block END.
    }
    }

