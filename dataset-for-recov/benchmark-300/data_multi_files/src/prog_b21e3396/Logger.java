import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<String> log = new ArrayList<>();

    public void log(String message) {
        log.add(message);
    }

    public List<String> getLog() {
        return log;
    }
}
