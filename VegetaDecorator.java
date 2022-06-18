public class VegetaDecorator extends SaladDecorator {
    public VegetaDecorator(Salad customSalad) {
        super(customSalad);
    }

    @Override
    public String make() {
        return customSalad.make() + addVegetables();
    }

    private String addVegetables() {
        return " + pomidor";
    }
}
