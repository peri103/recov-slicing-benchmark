import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 1, m = 1;
        // Block 2:
        double od_od = n * (n - 1) / 2.0;
        // Block 3:
        double ev_ev = m * (m - 1) / 2.0;
        // Block 4:
        System.out.println((int) (od_od + ev_ev));
        // Block END.
    }
    }

