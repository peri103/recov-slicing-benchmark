public class FruitBasket {
    private StrBuilderWrapper strBuilderWrapper = new StrBuilderWrapper();

    public void addFruit(String fruit) {
        strBuilderWrapper.appendFruit(fruit);
    }

    public String getFruits() {
        return strBuilderWrapper.getFruits();
    }
}
