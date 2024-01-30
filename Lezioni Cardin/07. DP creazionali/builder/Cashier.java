package builder;

public class Cashier { //nasconte i metodi del builder
    public HappyMeal serveStarWarsHappyMeal() {
        return new HappyMealBuilder()
                .withBurger("Toasted Cheeseburger")
                .withDrink("Coca Cola")
                .withFruit("Apple")
                .withToy("Star Wars")
                .withCake("Chocolate Cake")
                .createHappyMeal();
    }

    public HappyMeal serveFrozenHappyMeal() {
        return new HappyMealBuilder()
                .withBurger("Toasted Cheeseburger")
                .withDrink("Coca Cola")
                .withFruit("Apple")
                .withToy("Frozen")
                .withCake("Chocolate Cake")
                .createHappyMeal();
    }

    public HappyMeal serveHappyMealWithoutFruit() {
        return new HappyMealBuilder()
                .withBurger("Toasted Cheeseburger")
                .withDrink("Coca Cola")
                .withToy("Frozen")
                .withCake("Chocolate Cake")
                .createHappyMeal();
    }
}
