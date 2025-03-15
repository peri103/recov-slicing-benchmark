import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 4, b = 9, c = 0, d = 8;
        // Block 2:
        java.util.Set<Integer> set1 = new java.util.HashSet<>();
        set1.add(1);
        set1.add(9);
        set1.add(7);
        set1.add(4);
        
        java.util.Set<Integer> set2 = new java.util.HashSet<>();
        set2.add(a);
        set2.add(b);
        set2.add(c);
        set2.add(d);
        
        System.out.println(set1.equals(set2) ? "YES" : "NO");
        // Block END.
    }
    }
}
