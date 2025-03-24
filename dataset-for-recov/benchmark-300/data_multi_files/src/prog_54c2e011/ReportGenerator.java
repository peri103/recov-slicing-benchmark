import java.util.concurrent.LinkedBlockingDeque;

public class ReportGenerator {
    public void generateReport(LinkedBlockingDeque<Integer> dataQueue) throws InterruptedException {
        /* read */ int data = dataQueue.takeLast();
        System.out.println("Report Data: " + data);
    }
}
