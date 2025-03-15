class Main {
    public static void main(String[] args) {
        // Block 1:
        int X = 64146, Y = 123, Z = 456;
        // Block 2:
        if ((X - 2 * Z) % (Y + Z) >= Y) {
            // Block 3:
            System.out.println((X - 2 * Z) / (Y + Z) + 1);
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println((X - 2 * Z) / (Y + Z));
        }
        // Block END.
    }
}
