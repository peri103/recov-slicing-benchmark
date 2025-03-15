class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 13, y = 3, z = 1;
        // Block 2:
        int num = 0;
        // Block 3:
        int sum = z;
        // Block 4:
        for (int i = 0; i < x; i++) {
            // Block 5:
            if (sum <= x) {
                // Block 6:
                sum += y;
                // Block 7:
                num += 1;
                // Block 8:
                sum += z;
            }
        }
        // Block 9:
        System.out.println(num - 1);
        // Block END.
    }
}
