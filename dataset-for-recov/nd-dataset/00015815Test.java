import org.junit.jupiter.api.Test;

class _00015815Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] input = "64146 123 456".split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);
        int Z = Integer.parseInt(input[2]);
        System.out.println((X - Z) / (Y + Z));
        // Block END.
    }
    }

