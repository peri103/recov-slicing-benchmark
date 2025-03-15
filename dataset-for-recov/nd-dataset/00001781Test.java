import org.junit.jupiter.api.Test;

class _00001781Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String input = "10 3 5";
        String[] parts = input.split(" ");
        int[] x = new int[3];
        for (int i = 0; i < parts.length; i++) {
            x[i] = Integer.parseInt(parts[i]);
        }
        int minValue = Math.min(x[1], x[2]);
        int sumValue = x[1] + x[2] - x[0] > 0 ? x[1] + x[2] - x[0] : 0;
        System.out.println(minValue + " " + sumValue);
        // Block END.
    }
    }

