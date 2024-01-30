package dp_structureal.adapter;

public class RectangleObjectAdapter implements Polygon {

    private Rectangle rectangle; //per composizione
    private Double height;
    private Double width;

    public RectangleObjectAdapter() {

    }

    @Override
    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double getArea() {
        if (rectangle == null) {
            validateHeightAndWidth(height, width);
            rectangle = new Rectangle(width, height);
        }
        return rectangle.getArea();
    }

    private void validateHeightAndWidth(Double height, Double width) {
        if (height == null || width == null) {
            throw new IllegalArgumentException("Height and width must be not null");
        }
    }
}
