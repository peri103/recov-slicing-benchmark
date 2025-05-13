public class Main {
    public static void main(String[] args) {
        CSVConfiguration config = new CSVConfiguration();
        CSVProcessor processor = new CSVProcessor(config);

        String csvData = "name,age\nJohn,30\nJane,\nDoe,25";
        processor.parseData(csvData);

        RecordAnalyzer analyzer = new RecordAnalyzer(processor.getRecords());
        analyzer.analyzeRecords();

        boolean isConsistent = analyzer.checkConsistency(1);
        System.out.println("Record is consistent: " + isConsistent);
    }
}