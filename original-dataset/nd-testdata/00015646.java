class Main {
    public static void main(String[] args) {
        // Block 1:
        int X = 64145, Y = 123, Z = 456;
        // Block 2:
        int n = X / (Y + Z);
        // Block 3:
        if (X % (Y + Z) < Z) {
            // Block 4:
            System.out.println(n - 1);
        // Block 5:
        } else {
            // Block 6:
            System.out.println(n);
        }
        // Block END.
    }
}
