public class Main {
    public static void main(String[] args) {
        ArchiveEntryManager manager = new ArchiveEntryManager("test.txt", 1024);
        DataProcessor processor = new DataProcessor();

        int sum = processor.calculateSum();
        System.out.println("Sum of initial values in the map: " + sum);

        processor.updateValues(10);
        processor.printData();

        /* read */ long size = manager.getEntrySize();
        System.out.println("Size of entry: " + size);
    }
}