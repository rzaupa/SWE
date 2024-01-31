package dp.strutturali.decorator;
import java.util.List;

public abstract class ToppedPizza implements Pizza {
    private final Pizza toDecorate;

    protected ToppedPizza(Pizza toDecorate) {
        this.toDecorate = toDecorate;
    }

    @Override
    void doSomething(){
        this.toDecorate.doSomething();
    }

}
