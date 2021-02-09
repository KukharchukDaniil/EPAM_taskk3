package epam.task.third.comparators;

import epam.task.third.entities.Cone;

import java.util.Comparator;

public abstract class ConeComparator implements Comparator<Cone> {
    @Override
    public abstract int compare(Cone firstCone, Cone secondCone);
}
