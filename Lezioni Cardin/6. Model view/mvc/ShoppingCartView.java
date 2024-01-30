package mvc;

import java.util.Scanner;

//PRESENTATION LOGIC

public class ShoppingCartView implements Observer { // implementa la parte di view, presentation logic

    private final ShoppingCartService service;
    private final Scanner scanner;

    public ShoppingCartView(ShoppingCartService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void askNextOperation() {
        final String nextOperation = scanner.nextLine();
        switch (nextOperation) {
            case "addProduct":
                final String productId = scanner.nextLine();
                final ShoppingCart shoppingCart = service.findById(productId);
                final String productId = scanner.nextLine();
                try {
                    final long longProductId = Long.valueOf(productId);
                    shoppingCart.addProduct(service.findProductById(longProductId));
                    System.out.println("Product added");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid product id");
                }

                break;
            case "removeProduct":
                break;
            default:
                break;
        }
    }

    @Override
    public void update() {
        ShoppingCart shoppingCart = shoppingCartService.getState();
        System.out.println(
                "Shopping cart " + shoppingCart.getId() + " has " + shoppingCart.getProducts().size() + " products");
    }
}
