import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        
        byte[] extraData = {1, 2, 3, 4, 5};
        /* write */ jarEntry.setExtra(extraData);
        
        /* read */ byte[] retrievedData = jarEntry.getExtra();
        
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
    }
}