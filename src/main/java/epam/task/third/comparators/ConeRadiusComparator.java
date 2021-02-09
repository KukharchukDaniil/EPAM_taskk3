package epam.task.third.comparators;

import epam.task.third.entities.Cone;

public class ConeRadiusComparator extends ConeComparator{
    @Override
    public int compare(Cone firstCone, Cone secondCone) {
        Double firstConeRadius = firstCone.getRadius();
        Double secondConeRadius = secondCone.getRadius();
        return firstConeRadius.compareTo(secondConeRadius);
    }
}
