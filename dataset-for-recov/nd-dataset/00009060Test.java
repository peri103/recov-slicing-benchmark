import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = Integer.parseInt("1");
        // Block 2:
        int e = Integer.parseInt("9");
        // Block 3:
        int k = Integer.parseInt("15");
        // Block 4:
        System.out.println(k >= e - a ? "Yay!" : ":(");
        // Block END.
    }
    }
}
