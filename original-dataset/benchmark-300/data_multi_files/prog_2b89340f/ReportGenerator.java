import java.util.concurrent.LinkedBlockingDeque;

public class ReportGenerator {
    private LinkedBlockingDeque<Integer> dataQueue;

    public ReportGenerator(LinkedBlockingDeque<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public void generateReport() throws InterruptedException {
        /* read */ int data = dataQueue.takeFirst();
        System.out.println("Generating report with data: " + data);
    }
}
