class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 64146, y = 123, z = 456;
        // Block 2:
        int ans = x / (y + z);
        // Block 3:
        if (x < ans * (y + z) + z) {
            // Block 4:
            ans -= 1;
        }
        // Block 5:
        System.out.println(ans);
        // Block END.
    }
}
