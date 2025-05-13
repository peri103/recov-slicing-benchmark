public class Main {
    public static void main(String[] args) {
        StrBuilderWrapper strBuilderWrapper = new StrBuilderWrapper("Hello World");
        ComplexListProcessor listProcessor = new ComplexListProcessor();

        listProcessor.addStrings();
        listProcessor.processList();

        strBuilderWrapper.modifyString();

        listProcessor.modifyList();

        String result = strBuilderWrapper.getString();
        System.out.println(result); // Outputs "Greetng:Hello World!"

        System.out.println("Modified List: " + listProcessor.getStringList());
    }
}