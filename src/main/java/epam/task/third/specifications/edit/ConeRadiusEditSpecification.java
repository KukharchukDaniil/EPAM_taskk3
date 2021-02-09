package epam.task.third.specifications.edit;

import epam.task.third.entities.Cone;

public class ConeRadiusEditSpecification implements ConeEditSpecification {
    private final Double radius;

    public ConeRadiusEditSpecification(Double radius) {
        this.radius = radius;
    }

    @Override
    public void edit(Cone cone) {
        cone.setRadius(radius);
    }
}
