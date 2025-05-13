import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class CSVHandler {
    private CSVParser parser;
    private ArrayList<String> namesList = new ArrayList<>();
    private ArrayList<Integer> agesList = new ArrayList<>();

    public CSVHandler(String csvData) {
        try {
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
            this.parser = CSVParser.parse(new StringReader(csvData), format);

            for (CSVRecord record : parser) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                namesList.add(name);
                agesList.add(age);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getNamesList() {
        return namesList;
    }

    public ArrayList<Integer> getAgesList() {
        return agesList;
    }

    public CSVRecord getFirstRecord() {
        return parser.getRecords().get(0);
    }
}
