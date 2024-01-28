package dp_structureal.adapter;

public class RectangleClassAdapter extends Rectangle implements Polygon { // istanza di rettangolo, non composizione

    public RectangleClassAdapter() {
        super(0.0, 0.0);
    }

    @Override
    public void setHeight(Double height) {
    }

    @Override
    public void setWidth(Double width) {
    }

    @Override
    public Double getArea() {
    }
}