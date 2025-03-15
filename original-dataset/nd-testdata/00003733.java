class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 100000, y = 1, z = 1;
        // Block 2:
        x -= z;
        // Block 3:
        if (x >= 0) {
            // Block 4:
            System.out.println(x / (y + z));
        // Block 5:
        } else {
            // Block 6:
            System.out.println(0);
        }
        // Block END.
    }
}
