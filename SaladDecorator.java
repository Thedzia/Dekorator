public abstract class SaladDecorator implements Salad {
    protected Salad customSalad;

    public SaladDecorator(Salad customSalad) {
        this.customSalad = customSalad;
    }

    @Override
    public String make() {
        return customSalad.make();
    }
}
