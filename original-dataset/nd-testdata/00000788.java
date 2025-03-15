class Main {
    public static void main(String[] args) {
        // Block 1:
        int K = 2;
        // Block 2:
        int mod = 7;
        // Block 3:
        int number = 1;
        // Block 4:
        for (int i = 0; i < K; i++) {
            // Block 5:
            if (mod % K == 0) {
                // Block 6:
                break;
            }
            // Block 7:
            number += 1;
            // Block 8:
            mod = (mod * 10 + 7) % K;
        }
        // Block 9:
        if (mod % K == 0) {
            // Block 10:
            System.out.println(number);
        }
        // Block 11:
        else {
            // Block 12:
            System.out.println(-1);
        }
        // Block END.
    }
}
