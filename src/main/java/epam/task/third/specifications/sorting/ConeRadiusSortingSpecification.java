package epam.task.third.specifications.sorting;

import epam.task.third.entities.Cone;

public class ConeRadiusSortingSpecification implements ConeSortingSpecification {
    private Double radius;

    public ConeRadiusSortingSpecification(Double radius) {
        this.radius = radius;
    }

    @Override
    public boolean isSpecified(Cone cone) {
        return radius.equals(cone.getRadius());
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }
}
