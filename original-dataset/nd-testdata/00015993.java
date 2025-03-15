class Main {
    public static void main(String[] args) {
        // Block 1:
        String a1 = "20 15";
        // Block 2:
        String[] a2 = a1.split(" ");
        // Block 3:
        String a3 = a2[0];
        String a4 = a2[1];
        // Block 4:
        int A = Integer.parseInt(a3);
        int B = Integer.parseInt(a4);
        // Block 5:
        System.out.println(Math.max(0, A - 2 * B));
        // Block END.
    }
}
