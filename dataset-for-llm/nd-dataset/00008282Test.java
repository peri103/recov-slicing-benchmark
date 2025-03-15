import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 3, K = 3;
        // Block 2:
        int[] A = {1, 2, 3};
        // Block 3:
        int divide_number = K - 1;
        // Block 4:
        int other_number = N - 1;
        // Block 5:
        int answer = 0;
        // Block 6:
        answer = other_number / divide_number;
        // Block 7:
        if (other_number % divide_number != 0) {
            // Block 8:
            answer += 1;
        }
        // Block 9:
        System.out.println(answer);
        // Block END.
    }
    }
}
