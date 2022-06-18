public class Client {
    public static void main(String[] args) {
        Salad salad = new SaladDecorator(new VegetaDecorator(new SimpleSalad()));
        System.out.println(salad.make());
    }
}
