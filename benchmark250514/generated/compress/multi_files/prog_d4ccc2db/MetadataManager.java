import java.util.HashMap;
import java.util.Map;

public class MetadataManager {
    private Map<String, String> metadata = new HashMap<>();

    public void addMetadata(String key, String value) {
        metadata.put(key, value);
    }

    public String getMetadata(String key) {
        return metadata.get(key);
    }

    public void printMetadata() {
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
