class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 64145, y = 123, z = 456;
        // Block 2:
        x -= z;
        // Block 3:
        System.out.println((x - (x % (y + z))) / (y + z));
        // Block END.
    }
}
