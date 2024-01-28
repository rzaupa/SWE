package builder;

import java.util.Objects;

public class HappyMealBuilder {
    private String drink;
    private String fruit = null;
    private String toy;
    private String burger;
    private String cake;

    public HappyMealBuilder withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public HappyMealBuilder withFruit(String fruit) {
        this.fruit = fruit;
        return this;
    }

    public HappyMealBuilder withToy(String toy) {
        this.toy = toy;
        return this;
    }

    public HappyMealBuilder withBurger(String burger) {
        this.burger = burger;
        return this;
    }

    public HappyMealBuilder withCake(String cake) {
        this.cake = cake;
        return this;
    }

    public HappyMeal createHappyMeal() {
        Objects.nonNull(drink);
        Objects.nonNull(toy);
        Objects.nonNull(burger);
        Objects.nonNull(cake);
        return new HappyMeal(drink, fruit, toy, burger, cake);
    }
}
