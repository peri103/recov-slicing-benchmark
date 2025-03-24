import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.processStudentData(1);
        ConcurrentLinkedQueue<Integer> processedData = student.getProcessedData();
        /* read */ Integer value = processedData.poll();
        System.out.println("Processed Data: " + value);
    }
}