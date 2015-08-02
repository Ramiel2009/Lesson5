package lesson5;

/**
 * Created by Maxim on 31.07.2015.
 */
public class Square implements OperationObserver {
    private double square;

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Square{" +
                "square=" + square +
                '}';
    }
    @Override
    public double valueChanged(Rectangle observed){
        return square = observed.getHeight()*observed.getWidth();
    }
}
