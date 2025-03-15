class Main {
    public static void main(String[] args) {
        // Block 1:
        String A = "SUN";
        // Block 2:
        String[] S = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 3:
        for (int i = 0; i < 7; i++) {
            // Block 4:
            if (A.equals(S[i])) {
                // Block 5:
                System.out.println(7 - i);
                // Block 6:
                break;
            }
            // Block 7:
            i += 1; // This line is not necessary in Java as the for loop already increments i
        }
        // Block END.
    }
}
