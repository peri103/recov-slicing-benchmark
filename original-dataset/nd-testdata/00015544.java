class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 12, y = 3, z = 1;
        // Block 2:
        x -= 2 * z;
        // Block 3:
        System.out.println(x / (y + z) + x % (y + z) / y);
        // Block END.
    }
}
