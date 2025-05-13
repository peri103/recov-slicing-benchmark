public class Main {
    public static void main(String[] args) {
        try {
            CSVUtils csvUtils = new CSVUtils();
            csvUtils.configureFormat(); // Configure the CSV format with auto flush

            String data = "header1,header2\nvalue1,value2\n";
            csvUtils.writeData(data); // Write data to the CSV

            CSVReader csvReader = new CSVReader();
            csvReader.parseData(csvUtils.getWrittenData(), csvUtils.getFormat()); // Parse the written data

            boolean isMapped = csvReader.isHeaderMapped("header1");
            System.out.println("Is 'header1' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}