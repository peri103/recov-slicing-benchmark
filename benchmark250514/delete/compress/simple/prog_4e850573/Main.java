import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("initialName");
        /* write */ jarEntry.setName("updatedName");
        /* read */ String name = jarEntry.getName();
        System.out.println(name);
    }
}