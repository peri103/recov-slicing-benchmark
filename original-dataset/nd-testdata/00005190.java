class Main {
    public static void main(String[] args) {
        // Block 1:
        String a = "xyz";
        // Block 2:
        char f = a.charAt(0);
        // Block 3:
        char l = a.charAt(a.length() - 1);
        // Block 4:
        int le = a.length() - 2;
        // Block 5:
        System.out.println(f + String.valueOf(le) + l);
        // Block END.
    }
}
