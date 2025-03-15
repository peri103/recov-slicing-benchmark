class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 13, y = 3, z = 1;
        // Block 2:
        int seated = z;
        // Block 3:
        int cnt = 0;
        // Block 4:
        while (true) {
            // Block 5:
            seated += (y + z);
            // Block 6:
            if (seated > x) {
                // Block 7:
                break;
            }
            // Block 8:
            cnt += 1;
        }
        // Block 9:
        System.out.println(cnt);
        // Block END.
    }
}
