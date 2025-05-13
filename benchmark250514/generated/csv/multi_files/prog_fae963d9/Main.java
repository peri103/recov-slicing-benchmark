public class Main {
    public static void main(String[] args) {
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";
        CSVProcessor processor = new CSVProcessor();
        processor.processCSVData(csvData);
    }
}