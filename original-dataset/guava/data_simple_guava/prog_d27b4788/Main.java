import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        /* write */ ExecutorService executorService = MoreExecutors.newDirectExecutorService();
        /* read */ ExecutorService retrievedService = MoreExecutors.get(executorService);
        System.out.println("Executor Service retrieved successfully: " + (retrievedService != null));
    }
}