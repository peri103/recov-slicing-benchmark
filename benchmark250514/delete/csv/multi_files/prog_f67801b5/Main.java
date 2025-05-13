public class Main {
    public static void main(String[] args) throws Exception {
        String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";

        CSVHandler csvHandler = new CSVHandler(csvData);
        DataProcessor dataProcessor = new DataProcessor();

        CSVRecord record = csvHandler.getRecord(0);
        dataProcessor.processRecord(record);

        boolean isMapped = dataProcessor.isNameMapped(record);
        System.out.println("Is 'Name' mapped: " + isMapped);

        String eligibilityMessage = dataProcessor.getEligibilityMessage();
        System.out.println(eligibilityMessage);
    }
}