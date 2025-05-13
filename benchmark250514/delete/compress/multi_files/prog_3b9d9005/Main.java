public class Main {
    public static void main(String[] args) {
        ArchiveProcessor processor = new ArchiveProcessor();
        processor.processEntries();
        long lastModified = processor.getLastModified(0);
        System.out.println("Last modified of first entry: " + lastModified);

        // Additional unrelated complexity
        for (int i = 0; i < 5; i++) {
            System.out.println("Entry number: " + i);
        }
    }
}