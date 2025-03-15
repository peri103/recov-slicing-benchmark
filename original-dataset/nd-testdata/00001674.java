class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        if (n < a + b) {
            // Block 3:
            System.out.println(Math.min(a, b) + " " + (a + b - n));
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println(Math.min(a, b) + " " + 0);
        }
        // Block END.
    }
}
