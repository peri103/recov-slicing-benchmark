import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FileManager {
    private ArrayList<String> fileList = new ArrayList<>();
    private Map<String, Long> fileSizeMap = new HashMap<>();

    public void addFile(String fileName, long size) {
        fileList.add(fileName);
        fileSizeMap.put(fileName, size);
    }

    public long calculateTotalSize() {
        long totalSize = 0;
        for (Long size : fileSizeMap.values()) {
            totalSize += size;
        }
        return totalSize;
    }

    public ArrayList<String> getFileList() {
        return fileList;
    }
}
