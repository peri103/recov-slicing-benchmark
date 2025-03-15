class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 12, y = 3, z = 1;
        // Block 2:
        int cnt = 0;
        // Block 3:
        x -= z;
        // Block 4:
        while (x >= 0) {
            // Block 5:
            x = x - (y + z);
            // Block 6:
            if (x >= 0) {
                // Block 7:
                cnt += 1;
            }
            // Block 8:
            else {
                // Block 9:
                break;
            }
        }
        // Block 10:
        System.out.println(cnt);
        // Block END.
    }
}
