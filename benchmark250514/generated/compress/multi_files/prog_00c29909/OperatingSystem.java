import java.util.HashMap;
import java.util.Map;

public class OperatingSystem {
    private Map<String, Integer> osMap = new HashMap<>();

    public OperatingSystem() {
        osMap.put("Windows", 0);
        osMap.put("Unix", 3);
        osMap.put("Mac", 7);
    }

    public int getOSCode(String osName) {
        return osMap.getOrDefault(osName, -1);
    }

    public void printOSCodes() {
        for (Map.Entry<String, Integer> entry : osMap.entrySet()) {
            System.out.println(entry.getKey() + " OS code: " + entry.getValue());
        }
    }
}