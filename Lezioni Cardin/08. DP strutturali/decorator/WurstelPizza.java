import java.util.ArrayList;
import java.util.List;

public class WurstelPizza extends ToppedPizza {
    protected WurstelPizza(Pizza toDecorate) {
        super(toDecorate);
    }

    @Override
    void doSomething(){
        super.doSomething();
        //skillissue
    }

}
