import java.util.HashMap;
import java.util.Map;

public class CompressionMethods {
    private Map<String, Integer> methods = new HashMap<>();

    public CompressionMethods() {
        methods.put("DEFLATED", org.apache.commons.compress.archivers.zip.ZipArchiveEntry.DEFLATED);
        methods.put("STORED", org.apache.commons.compress.archivers.zip.ZipArchiveEntry.STORED);
    }

    public Integer getMethodValue(String methodName) {
        return methods.get(methodName);
    }
}
