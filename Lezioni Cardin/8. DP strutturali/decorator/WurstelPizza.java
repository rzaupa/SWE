import java.util.ArrayList;
import java.util.List;

public class WurstelPizza extends ToppedPizza {
    protected WurstelPizza(Pizza toDecorate) {
        super(toDecorate);
    }

    @Override
    protected List<String> addIngredients(List<String> ingredients) {
        final List<String> ingredientsCopy = new ArrayList<>(ingredients);
        ingredients.add("wurstel");
        return ingredientsCopy;
    }
}
