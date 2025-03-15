class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 12, y = 3, z = 1;
        // Block 2:
        x = x - z;
        // Block 3:
        int c = y + z;
        // Block 4:
        int n = 0;
        // Block 5:
        while (x > 0) {
            // Block 6:
            if (c <= x) {
                // Block 7:
                n = n + 1;
                // Block 8:
                x = x - c;
            }
            // Block 9:
            else {
                // Block 10:
                break;
            }
        }
        // Block 11:
        System.out.println(n);
        // Block END.
    }
}
