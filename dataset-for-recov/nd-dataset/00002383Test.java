import org.junit.jupiter.api.Test;

class _00002383Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        System.out.println(java.util.stream.IntStream.of("0 3".split(" "))
            .mapToInt(Integer::parseInt)
            .map(i -> i * (i - 1) / 2)
            .sum());
        // Block END.
    }
    }

