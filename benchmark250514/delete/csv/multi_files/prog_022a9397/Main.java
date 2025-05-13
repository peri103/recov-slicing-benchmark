public class Main {
    public static void main(String[] args) {
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

        CSVConfiguration csvConfig = new CSVConfiguration();
        csvConfig.configureCommentMarker('#');

        CSVDataProcessor dataProcessor = new CSVDataProcessor(csvData, csvConfig.getCsvFormat());
        dataProcessor.processData();
    }
}