class Main {
    public static void main(String[] args) {
        // Block 1:
        int k = 101;
        // Block 2:
        k *= 9;
        // Block 3:
        int amari = 63;
        // Block 4:
        for (int i = 1; i <= 10_000_000; i++) {
            // Block 5:
            amari %= k;
            // Block 6:
            if (amari == 0) {
                // Block 7:
                System.out.println(i);
                // Block 8:
                break;
            }
            // Block 9:
            else {
                // Block 10:
                amari = amari * 10 + 63;
            }
        }
        // Block 11:
        else {
            // Block 12:
            System.out.println(-1);
        }
        // Block END.
    }
}
