import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String hp = "10";
        String N = "3";
        // Block 2:
        String[] a = {"4", "5", "6"};
        // Block 3:
        int sum = 0;
        for (String x : a) {
            sum += Integer.parseInt(x);
        }
        System.out.println(sum >= Integer.parseInt(hp) ? "Yes" : "No");
        // Block END.
    }
    }
}
