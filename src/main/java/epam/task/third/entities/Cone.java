package epam.task.third.entities;

import java.util.Objects;

public class Cone {
    private Point baseCentre;
    private Point apexPoint;
    private Double radius;

    public Cone(Point baseCentre, Point apexPoint, Double radius) {
        this.baseCentre = baseCentre;
        this.apexPoint = apexPoint;
        this.radius = radius;
    }

    public Point getBaseCentre() {
        return baseCentre;
    }

    public void setBaseCentre(Point baseCenter) {
        this.baseCentre = baseCenter;
    }

    public Point getApexPoint() {
        return apexPoint;
    }

    public void setApexPoint(Point apexPoint) {
        this.apexPoint = apexPoint;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cone cone = (Cone) o;
        return  baseCentre.equals(cone.baseCentre)
                && apexPoint.equals(cone.apexPoint)
                && radius.equals(cone.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseCentre, apexPoint, radius);
    }
}
