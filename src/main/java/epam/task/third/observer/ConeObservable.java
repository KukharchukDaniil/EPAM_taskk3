package epam.task.third.observer;

import epam.task.third.entities.Cone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConeObservable implements Observed{
    private List<Observer> observers;
    private Cone cone;

    public ConeObservable(List<Observer> observers, Cone cone) {
        this.observers = observers;
        this.cone = cone;
    }
    public ConeObservable(Cone cone, Observer... observers) {
        this.observers = new ArrayList<Observer>();
        this.observers.addAll(Arrays.asList(observers));
        this.cone = cone;
    }
    public ConeObservable(Cone cone) {
        this.observers = new ArrayList<>();
        this.cone = cone;
    }
    public void changeRadius(Double radius) {
        cone.setRadius(radius);
        notifyObservers();
    }
    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void addObserver(Observer observer) {
        observer.update(cone);
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(cone);
        }
    }
    public boolean isEmpty() {
        return observers.isEmpty();
    }
}
