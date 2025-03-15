import org.junit.jupiter.api.Test;

class _00013697Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String line_data = "10 0 15 0 30";
        // Block 2:
        String[] parts = line_data.split(" ");
        int H1 = Integer.parseInt(parts[0]);
        int M1 = Integer.parseInt(parts[1]);
        int H2 = Integer.parseInt(parts[2]);
        int M2 = Integer.parseInt(parts[3]);
        int K = Integer.parseInt(parts[4]);
        // Block 3:
        int miniutes = (H2 - H1) * 60 + (M2 - M1);
        // Block 4:
        System.out.println(miniutes - K);
        // Block END.
    }
    }

