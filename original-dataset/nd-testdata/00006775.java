class Main {
    public static void main(String[] args) {
        // Block 1:
        int hp_m = 210, n = 5;
        // Block 2:
        int[] attack = {31, 41, 59, 26, 53};
        // Block 3:
        int total_attack = 0;
        for (int value : attack) {
            total_attack += value;
        }
        // Block 4:
        if (total_attack >= hp_m) {
            // Block 5:
            System.out.println("Yes");
        // Block 6:
        } else {
            // Block 7:
            System.out.println("No");
        }
        // Block END.
    }
}
