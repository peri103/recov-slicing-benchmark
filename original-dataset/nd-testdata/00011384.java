class Main {
    public static void main(String[] args) {
        // Block 1:
        String[] A = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 2:
        String S = "SAT";
        // Block 3:
        for (int i = 0; i < 7; i++) {
            // Block 4:
            if (S.equals(A[i])) {
                // Block 5:
                System.out.println(7 - i);
            }
        }
        // Block END.
    }
}
