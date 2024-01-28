package abs_factory;

public class App {
    public static void main(String[] args) { //codice astratto sulla tipologia di prodotti
        UIFactory factory = selectUI(args[0]);
        final Window window = factory.buildWindow();
        final Button button = factory.buildButton();
        final Slider slider = factory.buildSlider();
        window.show();
        button.show();
        slider.show();
    }

    private static UIFactory selectUI(String arg) {
        if (arg.equals("Windows95")) {
            return new Windows95UIFactory();
        } else if (arg.equals("MacOs")) {
            return new MacOsUIFactory();
        } else {
            return null;
        }
    }
}
