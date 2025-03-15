class Main {
    public static void main(String[] args) {
        // Block 1:
        int k = 101;
        // Block 2:
        int a = 7;
        // Block 3:
        int cnt = 1;
        // Block 4:
        while (cnt <= k + 2) {
            // Block 5:
            if (a % k == 0) {
                // Block 6:
                System.out.println(cnt);
                // Block 7:
                boolean flag = true;
                // Block 8:
                break;
            }
            // Block 9:
            else {
                // Block 10:
                boolean flag = false;
                // Block 11:
                cnt++;
                // Block 12:
                a = (10 * a + 7) % k;
            }
        }
        // Block 13:
        if (!flag) {
            // Block 14:
            System.out.println(-1);
        }
        // Block END.
    }
}
