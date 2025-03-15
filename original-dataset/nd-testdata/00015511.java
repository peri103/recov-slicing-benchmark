class Main {
    public static void main(String[] args) {
        // Block 1:
        int X = 12, Y = 3, Z = 1;
        // Block 2:
        int s = Z;
        // Block 3:
        int c = 0;
        // Block 4:
        while (true) {
            // Block 5:
            s += Y + Z;
            // Block 6:
            if (s > X) {
                // Block 7:
                break;
            }
            // Block 8:
            c += 1;
        }
        // Block 9:
        System.out.println(c);
        // Block END.
    }
}
