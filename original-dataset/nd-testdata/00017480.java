class Main {
    public static void main(String[] args) {
        // Block 1:
        String S = "1700";
        // Block 2:
        if (1 <= Integer.parseInt(S.substring(0, 2)) && Integer.parseInt(S.substring(0, 2)) <= 12) {
            // Block 3:
            if (1 <= Integer.parseInt(S.substring(2)) && Integer.parseInt(S.substring(2)) <= 12) {
                // Block 4:
                System.out.println("AMBIGUOUS");
            }
            // Block 5:
            else {
                // Block 6:
                System.out.println("MMYY");
            }
        }
        // Block 7:
        else {
            // Block 8:
            if (1 <= Integer.parseInt(S.substring(2)) && Integer.parseInt(S.substring(2)) <= 12) {
                // Block 9:
                System.out.println("YYMM");
            }
            // Block 10:
            else {
                // Block 11:
                System.out.println("NA");
            }
        }
        // Block END.
    }
}
