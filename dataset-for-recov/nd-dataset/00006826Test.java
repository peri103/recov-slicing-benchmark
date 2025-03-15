import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 20, N = 3;
        // Block 2:
        String[] input = "4 5 6".split(" ");
        int[] A = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        // Block 3:
        int a_sum = 0;
        for (int num : A) {
            a_sum += num;
        }
        // Block 4:
        if (H - a_sum <= 0) {
            // Block 5:
            System.out.println("Yes");
        // Block 6:
        } else {
            // Block 7:
            System.out.println("No");
        }
        // Block END.
    }
    }

