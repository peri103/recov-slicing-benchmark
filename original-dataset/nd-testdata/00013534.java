class Main {
    public static void main(String[] args) {
        // Block 1:
        String n = "abcde,fghihgf,edcba";
        // Block 2:
        for (char i : n.toCharArray()) {
            // Block 3:
            if (i == ',') {
                // Block 4:
                n = n.replace(",", " ");
            }
        }
        // Block 5:
        System.out.println(n);
        // Block END.
    }
}
