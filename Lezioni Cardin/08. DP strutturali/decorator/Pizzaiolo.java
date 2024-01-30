public class Pizzaiolo {
    public static void main(String[] args) {
        Pizza margherita = new TomatoPizza(new MozzarellaCheesePizza(new BasePizza()));
        Pizza viennese = new WurstelPizza(new TomatoPizza(new MozzarellaCheesePizza(new BasePizza())));
        System.out.println("Margherita: " + margherita.ingredients());
        System.out.println("Viennese: " + viennese.ingredients());
    }
}
