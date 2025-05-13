import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        /* write */ jarEntry.setExtra(extraData);
        /* read */ byte[] readExtraData = jarEntry.getExtra();
        
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}