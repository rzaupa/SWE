public class TomatoPizza extends ToppedPizza {
    protected TomatoPizza(Pizza toDecorate) {
        super(toDecorate);
    }

    @Override
    protected List<String> addIngredients(List<String> ingredients) {
        final List<String> ingredientsCopy = new ArrayList<>(ingredients);
        ingredients.add("tomato");
        return ingredientsCopy;
    }

}
