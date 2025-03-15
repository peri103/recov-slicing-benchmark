import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int A = 8, B = 12, K = 2;
        // Block 2:
        System.out.println(findKthElement(A, B, K));
        // Block END.
    }

    private static int findKthElement(int A, int B, int K) {
        return findElements(A, B, K).get(findElements(A, B, K).size() - K);
    }

    private static List<Integer> findElements(int A, int B, int K) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            if (A % i + B % i < 1) {
                result.add(i);
            }
        }
        return result;
    }
    }

