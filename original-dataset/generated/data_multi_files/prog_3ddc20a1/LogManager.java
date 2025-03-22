import java.util.ArrayList;

public class LogManager {
    private ArrayList<String> log = new ArrayList<>();

    public void addLog(String message) {
        log.add(message);
    }

    public void displayLogs() {
        System.out.println("Log Messages:");
        for (String message : log) {
            System.out.println(message);
        }
    }
}
