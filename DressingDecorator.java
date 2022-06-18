public class DressingDecorator extends SaladDecorator {
    public DressingDecorator(Salad customSalad) {
        super(customSalad);
    }

    @Override
    public String make() {
        return customSalad.make() + addDressing();
    }

    private String addDressing() {
        return " + cezar";
    }
}