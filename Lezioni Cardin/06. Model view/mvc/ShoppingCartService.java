package mvc;

//BUSINESS LOGIC

public class ShoppingCartService extends Subject { //pesca dalla persisten logic, è il modello, business logic
    private ShoppingCart shoppingCart; 

    ShoppingCart findById(String id) {
        return new ShoppingCart(id);
    }

    Product findProductById(String id) {
        return new Product(id, "description");
    }

    @Override
    public ShoppingCart getState(){
        return shoppingCart
    }
}
