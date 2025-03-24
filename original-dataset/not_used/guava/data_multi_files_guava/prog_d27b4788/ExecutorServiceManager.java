import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceManager {
    private ExecutorService executorService;

    public void createExecutorService() {
        /* write */ executorService = MoreExecutors.newDirectExecutorService();
    }

    public ExecutorService getExecutorService() {
        return executorService;
    }
}
