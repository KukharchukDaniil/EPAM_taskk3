package epam.task.third.entities;

import java.util.Objects;

public class Cone implements Cloneable{
    private static final Integer DEFAULT_ID = 0;
    private Point baseCentre;
    private Point apexPoint;
    private Double radius;
    private Integer ID = DEFAULT_ID;
    public Cone(Point baseCentre, Point apexPoint, Double radius) {
        this.baseCentre = baseCentre;
        this.apexPoint = apexPoint;
        this.radius = radius;
    }
    public Cone(Point baseCentre, Point apexPoint, Double radius, Integer ID) {
        this.baseCentre = baseCentre;
        this.apexPoint = apexPoint;
        this.radius = radius;
        this.ID = ID;
    }
    public Integer getId() {
        return ID;
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
        return baseCentre.equals(cone.baseCentre)
                && apexPoint.equals(cone.apexPoint)
                && radius.equals(cone.radius)
                && ID.equals(cone.ID);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseCentre, apexPoint, radius, ID);
    }
}
