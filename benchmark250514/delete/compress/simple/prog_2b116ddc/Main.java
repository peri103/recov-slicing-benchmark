import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("initial");
        /* write */ jarEntry.setName("example.jar");
        /* read */ String name = jarEntry.getName();
        System.out.println(name);
    }
}