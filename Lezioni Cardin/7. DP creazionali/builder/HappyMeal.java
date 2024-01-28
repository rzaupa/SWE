package builder;

public class HappyMeal { //oggetto complesso
    private final String drink;
    private final String fruit;
    private final String toy;
    private final String burger;
    private final String cake;

    protected HappyMeal(String drink, String fruit, String toy, String burger, String cake) {
        this.drink = drink;
        this.fruit = fruit;
        this.toy = toy;
        this.burger = burger;
        this.cake = cake;
    }
}
