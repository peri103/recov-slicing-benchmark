import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int[] num = {10, 7, 5};
        // Block 2:
        int a = Math.min(num[1], num[2]);
        // Block 3:
        int b = Math.max(0, (num[1] + num[2]) - num[0]);
        // Block 4:
        System.out.println(a + " " + b);
        // Block END.
    }
    }
}
