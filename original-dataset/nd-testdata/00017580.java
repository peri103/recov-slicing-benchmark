class Main {
    public static void main(String[] args) {
        // Block 1:
        String S = "1905";
        // Block 2:
        char[] s = S.toCharArray();
        // Block 3:
        int left = Character.getNumericValue(s[0]) * 10 + Character.getNumericValue(s[1]);
        // Block 4:
        int right = Character.getNumericValue(s[2]) * 10 + Character.getNumericValue(s[3]);
        // Block 5:
        if (1 <= left && left <= 12) {
            // Block 6:
            if (1 <= right && right <= 12) {
                // Block 7:
                System.out.println("AMBIGUOUS");
            }
            // Block 8:
            else {
                // Block 9:
                System.out.println("MMYY");
            }
        }
        // Block 10:
        else {
            // Block 11:
            if (1 <= right && right <= 12) {
                // Block 12:
                System.out.println("YYMM");
            }
            // Block 13:
            else {
                // Block 14:
                System.out.println("NA");
            }
        }
        // Block END.
    }
}
