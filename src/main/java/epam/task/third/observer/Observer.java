package epam.task.third.observer;

import epam.task.third.entities.Cone;
import epam.task.third.entities.ConeParameters;

public interface Observer {
    public void update(Cone cone);
}
