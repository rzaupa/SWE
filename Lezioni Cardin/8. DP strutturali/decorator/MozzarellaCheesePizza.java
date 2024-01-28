public class MozzarellaCheesePizza extends ToppedPizza{
    protected MozzarellaCheesePizza(Pizza toDecorate) {
        super(toDecorate);
    }

    @Override
    protected List<String> addIngredients(List<String> ingredients) {
        final List<String> ingredientsCopy = new ArrayList<>(ingredients);
        ingredients.add("mozzarella cheese");
        return ingredientsCopy;
    }
    
}
