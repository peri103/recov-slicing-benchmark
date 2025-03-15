class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 100, a = 100, b = 100;
        // Block 2:
        int max;
        if (a < b) {
            // Block 3:
            max = a;
        // Block 4:
        } else {
            // Block 5:
            max = b;
        }
        // Block 6:
        int min = (a + b) - n;
        // Block 7:
        if (min < 0) {
            // Block 8:
            min = 0;
        }
        // Block 9:
        System.out.println(max + " " + min);
        // Block END.
    }
}
