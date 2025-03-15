class Main {
    public static void main(String[] args) {
        // Block 1:
        String[] parts = "D H".split(" ");
        String a = parts[0];
        String b = parts[1];
        System.out.println(new String[][] {{"H", "D"}, {b}}[a.equals("H") ? 0 : 1][0]);
        // Block END.
    }
}
