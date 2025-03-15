class Main {
    public static void main(String[] args) {
        // Block 1:
        int k = 101;
        // Block 2:
        int n = 7;
        // Block 3:
        int cnt = 1;
        // Block 4:
        for (int i = 0; i < k; i++) {
            // Block 5:
            if (n % k == 0) {
                // Block 6:
                break;
            }
            // Block 7:
            n = (n * 10 + 7) % k;
            // Block 8:
            cnt += 1;
        }
        // Block 9:
        if (n % k == 0) {
            // Block 10:
            System.out.println(cnt);
        }
        // Block 11:
        else {
            // Block 12:
            System.out.println(-1);
        }
        // Block END.
    }
}
