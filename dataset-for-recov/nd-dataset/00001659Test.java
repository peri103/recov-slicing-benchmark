import org.junit.jupiter.api.Test;

class _00001659Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] input = "10 7 5".split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        System.out.println(Math.min(b, c) + " " + Math.max(0, b + c - a));
        // Block END.
    }
    }

