public class NumberManager {
    private NumberSet numberSet = new NumberSet();

    public void addNumber(int number) {
        numberSet.addNumber(number);
    }

    public boolean checkNumber(int number) {
        return numberSet.containsNumber(number);
    }
}
