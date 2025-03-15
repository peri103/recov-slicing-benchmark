import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 5;
        // Block 2:
        java.util.Set<Integer> a = new java.util.HashSet<>();
        a.add(7);
        a.add(5);
        a.add(3);
        // Block 3:
        System.out.println(a.contains(x) ? "YES" : "NO");
        // Block END.
    }
    }

