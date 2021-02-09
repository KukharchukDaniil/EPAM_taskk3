package epam.task.third.specifications.sorting;

import epam.task.third.entities.Cone;

public class ConeRadiusSortingSpecification implements ConeSortingSpecification {
    private final Double radius;

    public ConeRadiusSortingSpecification(Double radius) {
        this.radius = radius;
    }

    @Override
    public boolean isSpecified(Cone cone) {
        return radius.equals(cone.getRadius());
    }
}
