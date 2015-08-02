package lesson5;

class Perimeter implements OperationObserver {
    private double perimeter;

    public double valueChanged (Rectangle observed){
        return perimeter = 2 * (observed.getWidth() + (observed.getHeight()));
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Perimeter{" +
                "perimeter=" + perimeter +
                '}';
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }


}
