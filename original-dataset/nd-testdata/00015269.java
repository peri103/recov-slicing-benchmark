class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 12, y = 3, z = 1;
        // Block 2:
        int n = 1;
        // Block 3:
        while (x >= (n + 1) * z + n * y) {
            // Block 4:
            n += 1;
        }
        // Block 5:
        System.out.println(n - 1);
        // Block END.
    }
}
