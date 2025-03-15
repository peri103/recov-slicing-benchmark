import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

class _00008525Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 1;
        // Block 2:
        List<List<Integer>> candy_map = new ArrayList<>();
        // Block 3:
        candy_map.add(new ArrayList<>());
        Scanner scanner = new Scanner("2");
        while (scanner.hasNextInt()) {
            candy_map.get(0).add(scanner.nextInt());
        }
        // Block 4:
        candy_map.add(new ArrayList<>());
        scanner = new Scanner("3");
        while (scanner.hasNextInt()) {
            candy_map.get(1).add(scanner.nextInt());
        }
        // Block 5:
        int[][] dp = new int[2][n];
        // Block 6:
        dp[0][0] = candy_map.get(0).get(0);
        // Block 7:
        for (int i = 1; i < n; i++) {
            // Block 8:
            dp[0][i] = dp[0][i - 1] + candy_map.get(0).get(i);
        }
        // Block 9:
        dp[1][0] = dp[0][0] + candy_map.get(1).get(0);
        // Block 10:
        for (int i = 1; i < n; i++) {
            // Block 11:
            dp[1][i] = candy_map.get(1).get(i) + Math.max(dp[0][i], dp[1][i - 1]);
        }
        // Block 12:
        System.out.println(dp[1][dp[1].length - 1]);
        // Block END.
    }
    }

