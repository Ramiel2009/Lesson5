package lesson5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Maxim on 31.07.2015.
 */
public class Rectangle {
    private double width;
    private double height;
    private ArrayList<OperationObserver> observerList = new ArrayList<OperationObserver>();

    public Rectangle (double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }

    public void addObserver(OperationObserver observer){
        observerList.add(observer);
    }


    public void notifyObserver(){
        for(OperationObserver operationObserver : observerList) {
            operationObserver.valueChanged(this);
        }
    }

    @Override
    public String toString() {
        String s ="";
        Iterator it = observerList.iterator();
        while(it.hasNext()){
            s = s+ ((OperationObserver)it.next()).toString() +"\n";
        }
        return s;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        notifyObserver();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        notifyObserver();
    }


}
