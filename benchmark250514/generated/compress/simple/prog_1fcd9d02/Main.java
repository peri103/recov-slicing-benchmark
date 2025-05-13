import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        /* write */ entry.setComment("This is a test comment");
        /* read */ String comment = entry.getComment();
        System.out.println(comment);
    }
}