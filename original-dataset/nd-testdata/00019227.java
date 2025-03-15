class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 5;
        // Block 2:
        if (n % 2 != 0) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int c = 0;
            // Block 6:
            n /= 2;
            // Block 7:
            while (n != 0) {
                // Block 8:
                n /= 5;
                // Block 9:
                c += n;
            }
            // Block 10:
            System.out.println(c);
        }
        // Block END.
    }
}
