public class ReportGenerator {
    private DataProcessor dataProcessor;

    public ReportGenerator(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    public void generateReport() throws InterruptedException {
        int processedData = dataProcessor.getProcessedData();
        System.out.println("Generated Report with Data: " + processedData);
    }
}
