public class Main {
    public static void main(String[] args) {
        ZipEntryManager manager = new ZipEntryManager("example.txt");
        byte[] extraData = new byte[]{1, 2, 3, 4};
        manager.setExtraData(extraData);

        byte[] anotherExtraData = new byte[]{5, 6, 7, 8};
        int sum = ComplexOperations.calculateSum(anotherExtraData);
        System.out.println("Sum of anotherExtraData: " + sum);

        byte[] manipulatedData = ComplexOperations.manipulateData(extraData);
        int product = ComplexOperations.calculateProduct(manipulatedData);
        System.out.println("Product of manipulatedData: " + product);

        /* read */ byte[] readData = manager.getExtraData();

        System.out.print("Read data from entry: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}