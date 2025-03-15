import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 1;
        // Block 2:
        int b = 2;
        // Block 3:
        int c = 4;
        // Block 4:
        int d = 8;
        // Block 5:
        int e = 9;
        // Block 6:
        int k = 15;
        // Block 7:
        java.util.List<Integer> l = new java.util.ArrayList<>();
        // Block 8:
        l.add(b - a);
        // Block 9:
        l.add(c - a);
        // Block 10:
        l.add(d - a);
        // Block 11:
        l.add(e - a);
        // Block 12:
        l.add(c - b);
        // Block 13:
        l.add(d - b);
        // Block 14:
        l.add(e - b);
        // Block 15:
        l.add(d - c);
        // Block 16:
        l.add(e - c);
        // Block 17:
        l.add(e - d);
        // Block 18:
        if (java.util.Collections.max(l) <= k) {
            // Block 19:
            System.out.println("Yay!");
        // Block 20:
        } else {
            // Block 21:
            System.out.println(":(");
        }
        // Block END.
    }
    }

