import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskManager {
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<?> submitTask(Runnable task) {
        return executor.submit(task);
    }

    public void shutdown() {
        executor.shutdown();
    }
}
