package dp.strutturali.adapter;

public class Client {
    public static void main(String[] args) {
        final Polygon polygon = new RectangleObjectAdapter();
        polygon.setHeight(10.0);
        polygon.setWidth(5.0);
        System.out.println("Area: " + polygon.getArea());
    }
}
