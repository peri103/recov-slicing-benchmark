import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int[] list = {10, 7, 5};
        // Block 2:
        System.out.println(Math.min(list[0], Math.min(list[1], list[2])), (list[1] + list[2]) - list[0] > 0 ? (list[1] + list[2]) - list[0] : 0);
        // Block END.
    }
    }

