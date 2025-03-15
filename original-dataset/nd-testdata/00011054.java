class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "akasaka";
        // Block 2:
        int n = s.length() / 2;
        // Block 3:
        if (s.substring(0, n).equals(s.substring(n + 1))) {
            // Block 4:
            System.out.println("Yes");
        // Block 5:
        } else {
            // Block 6:
            System.out.println("No");
        }
        // Block END.
    }
}
