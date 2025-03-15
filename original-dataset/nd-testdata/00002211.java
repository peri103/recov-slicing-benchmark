class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 100, a = 100, b = 100;
        // Block 2:
        System.out.println((a < b ? a : b) + " " + (a + b < n ? 0 : a + b - n));
        // Block END.
    }
}
