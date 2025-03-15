import org.junit.jupiter.api.Test;

class _00011296Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] a = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 2:
        String s = "SAT";
        // Block 3:
        int k = -1;
        // Block 4:
        for (int i = 0; i < 7; i++) {
            // Block 5:
            if (a[i].equals(s)) k = i;
        }
        // Block 6:
        k = (7 - k);
        // Block 7:
        System.out.println(k);
        // Block END.
    }
    }

