class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "level";
        // Block 2:
        int n = s.length();
        // Block 3:
        if (!s.equals(new StringBuilder(s).reverse().toString())) {
            // Block 4:
            System.out.println("No");
        // Block 5:
        } else if (!s.substring(0, (n - 1) / 2).equals(new StringBuilder(s.substring(0, (n - 1) / 2)).reverse().toString())) {
            // Block 6:
            System.out.println("No");
        // Block 7:
        } else if (!s.substring((n + 3) / 2 - 1).equals(new StringBuilder(s.substring((n + 3) / 2 - 1)).reverse().toString())) {
            // Block 8:
            System.out.println("No");
        // Block 9:
        } else {
            // Block 10:
            System.out.println("Yes");
        }
        // Block END.
    }
}
