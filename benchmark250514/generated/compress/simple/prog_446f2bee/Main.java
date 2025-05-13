import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        /* write */ jarEntry.setComment("This is a test comment");
        /* read */ String comment = jarEntry.getComment();
        System.out.println(comment);
    }
}