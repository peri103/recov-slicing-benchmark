class Main {
    public static void main(String[] args) {
        // Block 1:
        int X = 64145, Y = 123, Z = 456;
        // Block 2:
        X = X - Z;
        // Block 3:
        int A = X / (Y + Z);
        // Block 4:
        System.out.println(Math.round(A));
        // Block END.
    }
}
