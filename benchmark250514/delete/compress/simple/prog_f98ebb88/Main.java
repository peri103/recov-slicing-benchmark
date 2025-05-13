import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("initial");
        /* write */ entry.setName("newName");
        /* read */ String name = entry.getName();
        System.out.println(name);
    }
}