class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 13, y = 3, z = 1;
        // Block 2:
        int temp = z;
        // Block 3:
        int result = 0;
        // Block 4:
        while (temp <= x - y - z) {
            // Block 5:
            temp = temp + y + z;
            // Block 6:
            result = result + 1;
        }
        // Block 7:
        System.out.println(result);
        // Block END.
    }
}
