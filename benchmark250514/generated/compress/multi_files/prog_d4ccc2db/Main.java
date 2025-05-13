public class Main {
    public static void main(String[] args) {
        GzipCommentManager commentManager = new GzipCommentManager();
        MetadataManager metadataManager = new MetadataManager();

        // Add some dummy metadata
        metadataManager.addMetadata("Author", "John Doe");
        metadataManager.addMetadata("Version", "1.0.2");

        // Print metadata
        metadataManager.printMetadata();

        // Set a comment in GzipParameters
        commentManager.setComment("This is a comment");

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Retrieve and print the comment
        /* read */ String comment = commentManager.getComment();
        System.out.println(comment);

        // Additional metadata operations
        metadataManager.addMetadata("License", "MIT");
        System.out.println("License: " + metadataManager.getMetadata("License"));
    }
}