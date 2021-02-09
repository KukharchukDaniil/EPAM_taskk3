package epam.task.third.comparators;

import epam.task.third.entities.Cone;

public class ConeIdComparator extends ConeComparator{
    @Override
    public int compare(Cone firstCone, Cone secondCone) {
        Integer firstId = firstCone.getId();
        Integer secondId = secondCone.getId();
        return firstId.compareTo(secondId);
    }
}
