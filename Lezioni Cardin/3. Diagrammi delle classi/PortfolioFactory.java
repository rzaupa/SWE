import java.util.List;

public class PortfolioFactory { // non modifichiamo il client ma solo questa classe nel caso in cui cambia il
                                // costruttore di Portfolio
    public static Portfolio createPortfolio(String name) { // dipendenza di tipo create
        return new Portfolio(name);
    }
}

public class Portfolio {
    private List<Stock> stocks;
    private String name;

    Portfolio(String name, List<Stock> stocks) {
        this.name = name;
    }

    public checkPrice(Price price){ //dipendenza di tipo call
        //...
    }

    public void addUsdPrice(Price price) { // dipendenza di tipo call
        if (isUsd(price)) {
            // ...
        }
    }

    private boolean isUsd(Price price) { // aumenta la leggibilità del codice, non statico!!
        return price != null && price.getCurrency().equals("USD");
    }
}

public class Stock {
    private final String id;
    private final long owned;

    public Stock(String id, long owned) {
        this.id = id;
        this.owned = owned;
    }
}

public class Client {
    public static void main(String[] args) {
        Portfolio p = PortfolioFactory.createPortfolio("p1");
        p.checkPrice(new Price(10));
    }
}
