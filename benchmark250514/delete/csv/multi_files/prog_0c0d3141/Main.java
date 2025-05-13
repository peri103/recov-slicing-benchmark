public class Main {
    public static void main(String[] args) {
        CSVConfiguration config = new CSVConfiguration();
        config.enableDuplicateHeaders();

        CSVDataProcessor processor = new CSVDataProcessor(config.getFormat());
        processor.processCSVData();

        boolean isMapped = processor.checkHeaderMapping("someHeader");
        System.out.println("Is the header mapped? " + isMapped);

        processor.checkHeaderExistence("header1");
        processor.checkHeaderExistence("header4");

        int totalLength = processor.calculateTotalValueLength();
        System.out.println("Total length of all values: " + totalLength);
    }
}