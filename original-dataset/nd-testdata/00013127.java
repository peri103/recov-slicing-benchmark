class Main {
    public static void main(String[] args) {
        // Block 1:
        int[] check = {7, 5, 3};
        // Block 2:
        int x = 6;
        // Block 3:
        boolean found = false;
        for (int num : check) {
            if (num == x) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
        // Block END.
    }
}
