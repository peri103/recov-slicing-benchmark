import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutorService;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* write */ ExecutorService executorService = MoreExecutors.newDirectExecutorService();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }

        // Simulating some task submission to the executor service
        executorService.submit(() -> System.out.println("Task executed in executor service"));

        // Unrelated code to add complexity
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        for (String str : stringList) {
            System.out.println("String: " + str);
        }

        /* read */ ExecutorService retrievedService = MoreExecutors.get(executorService);
        System.out.println("Executor Service retrieved successfully: " + (retrievedService != null));
    }
}