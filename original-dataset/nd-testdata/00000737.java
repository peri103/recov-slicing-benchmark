import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        // Block 1:
        int K = 101;
        // Block 2:
        int x = 7;
        // Block 3:
        int c = 1;
        // Block 4:
        HashSet<Integer> visited = new HashSet<>();
        visited.add(7);
        // Block 5:
        while (x % K != 0) {
            // Block 6:
            x *= 10;
            // Block 7:
            x += 7;
            // Block 8:
            x %= K;
            // Block 9:
            c += 1;
            // Block 10:
            int z = x % K;
            // Block 11:
            if (visited.contains(z)) {
                // Block 12:
                System.out.println(-1);
                // Block 13:
                System.exit(0);
            }
            // Block 14:
            visited.add(x % K);
        }
        // Block 15:
        System.out.println(c);
        // Block END.
    }
}
