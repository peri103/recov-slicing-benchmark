public class Student {
    private String name;
    private int age;
    private CSVConfig csvConfig;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.csvConfig = new CSVConfig();
    }

    public void configureCSV() {
        csvConfig.enableTrim();
    }

    public CSVConfig getCSVConfig() {
        return csvConfig;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
