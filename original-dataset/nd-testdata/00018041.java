class Main {
    public static void main(String[] args) {
        // Block 1:
        int s = 1700;
        // Block 2:
        int yy = s / 100;
        // Block 3:
        int mm = s % 100;
        // Block 4:
        if (1 <= yy && yy <= 12) {
            // Block 5:
            if (1 <= mm && mm <= 12) {
                // Block 6:
                System.out.println("AMBIGUOUS");
            }
            // Block 7:
            else {
                // Block 8:
                System.out.println("MMYY");
            }
        }
        // Block 9:
        else {
            // Block 10:
            if (1 <= mm && mm <= 12) {
                // Block 11:
                System.out.println("YYMM");
            }
            // Block 12:
            else {
                // Block 13:
                System.out.println("NA");
            }
        }
        // Block END.
    }
}
