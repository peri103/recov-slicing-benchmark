import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 211, N = 5;
        // Block 2:
        java.util.List<Integer> list = new java.util.ArrayList<>();
        // Block 3:
        for (int i : java.util.Arrays.asList(31, 41, 59, 26, 53)) {
            // Block 4:
            list.add(i);
        }
        // Block 5:
        if (H - list.stream().mapToInt(Integer::intValue).sum() <= 0) {
            // Block 6:
            System.out.println("Yes");
        }
        // Block 7:
        else {
            // Block 8:
            System.out.println("No");
        }
        // Block END.
    }
    }
}
