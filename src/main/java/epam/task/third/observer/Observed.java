package epam.task.third.observer;

public interface Observed {
    void removeObserver(Observer observer);
    void addObserver(Observer observer);
    void notifyObservers();
}
