import org.apache.commons.csv.CSVParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data with a comment
            String csvData = "# This is a comment\nname,age\nJohn,30\nDoe,25";

            // Use CSVDataHandler to parse CSV
            CSVDataHandler dataHandler = new CSVDataHandler();
            CSVParser parser = dataHandler.parseCSV(csvData);

            // Use CSVCommentExtractor to extract comments
            CSVCommentExtractor commentExtractor = new CSVCommentExtractor();
            String comment = commentExtractor.extractComment(parser);

            if (comment != null) {
                System.out.println(comment); // Output the comment
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}