import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private List<String> files = new ArrayList<>();

    public void addFile(String fileName) {
        files.add(fileName);
    }

    public List<String> getFiles() {
        return files;
    }
}
