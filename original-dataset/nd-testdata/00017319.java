class Main {
    public static void main(String[] args) {
        // Block 1:
        String a = "H", b = "H";
        // Block 2:
        String hd = "HD";
        // Block 3:
        System.out.println(hd.charAt((hd.indexOf(a) + hd.indexOf(b)) % 2));
        // Block END.
    }
}
