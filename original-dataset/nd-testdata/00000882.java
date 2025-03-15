class Main {
    public static void main(String[] args) {
        // Block 1:
        int k = 101;
        // Block 2:
        int seven = 0;
        // Block 3:
        int i = 0;
        // Block 4:
        if (k % 2 == 0) {
            // Block 5:
            System.out.println(-1);
        }
        // Block 6:
        else {
            // Block 7:
            while (true) {
                // Block 8:
                i += 1;
                // Block 9:
                seven = seven * 10 + 7;
                // Block 10:
                seven = seven % k;
                // Block 11:
                if (seven == 0) {
                    // Block 12:
                    System.out.println(i);
                    // Block 13:
                    break;
                }
                // Block 14:
                if (i > 1000000) {
                    // Block 15:
                    System.out.println(-1);
                    // Block 16:
                    break;
                }
            }
        }
        // Block END.
    }
}
