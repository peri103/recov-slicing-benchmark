import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileSystem {
    private static class File {
        boolean isDir;
        Map<String, File> files;
        StringBuilder content;

        public File(boolean isDir) {
            this.isDir = isDir;
            if (isDir) {
                files = new HashMap<>();
            } else {
                content = new StringBuilder();
            }
        }
    }

    File root;

    public FileSystem() {
        root = new File(true);
    }

    public List<String> ls(String path) {
        String[] names = path.split("/");
        File cur = root;
        for (String name : names) {
            if (!name.isEmpty()) {
                cur = cur.files.get(name);
            }
        }
        if (cur.isDir) {
            ArrayList<String> strings = new ArrayList<>(cur.files.keySet());
            Collections.sort(strings);
            return strings;
        } else {
            return Collections.singletonList(names[names.length - 1]);
        }
    }

    public void mkdir(String path) {
        String[] names = path.split("/");
        File cur = root;
        for (String name : names) {
            if (!name.isEmpty()) {
                if (!cur.files.containsKey(name)) {
                    cur.files.put(name, new File(true));
                }
                cur = cur.files.get(name);
            }
        }
    }

    public void addContentToFile(String filePath, String content) {
        String[] names = filePath.split("/");
        File cur = root;
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (!name.isEmpty()) {
                if (i == names.length - 1 && !cur.files.containsKey(name)) {
                    cur.files.put(name, new File(false));
                }
                cur = cur.files.get(name);
            }
        }
        cur.content.append(content);
    }

    public String readContentFromFile(String filePath) {
        String[] names = filePath.split("/");
        File cur = root;
        for (String name : names) {
            if (!name.isEmpty()) {
                cur = cur.files.get(name);
            }
        }
        return cur.content.toString();
    }

    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();
        fileSystem.mkdir("/goowmfn");
        System.out.println(fileSystem.ls("/"));
        System.out.println(fileSystem.ls("/goowmfn"));
        fileSystem.mkdir("/z");
        System.out.println(fileSystem.ls("/"));
        System.out.println(fileSystem.ls("/"));
        fileSystem.addContentToFile("/goowmfn/c", "shetopcy");
        System.out.println(fileSystem.ls("/goowmfn/c"));

    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */