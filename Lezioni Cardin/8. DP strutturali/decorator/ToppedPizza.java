package dp.strutturali.decorator;
import java.util.List;

public abstract class ToppedPizza implements Pizza {
    private final Pizza toDecorate;

    protected ToppedPizza(Pizza toDecorate) {
        this.toDecorate = toDecorate;
    }

    public List<String> ingredients() {
        return addIngredients(toDecorate.ingredients());
    }

    protected abstract List<String> addIngredients(List<String> ingredients);
}
