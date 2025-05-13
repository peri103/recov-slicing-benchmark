import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        CustomCSVPrinter printer = new CustomCSVPrinter();
        printer.addRecord(Arrays.asList("value1", "value2", "value3"));
        printer.addRecord(Arrays.asList("extra1", "extra2", "extra3"));

        CustomCSVReader reader = new CustomCSVReader(printer.getCSVContent());
        reader.readFirstRecord();
    }
}