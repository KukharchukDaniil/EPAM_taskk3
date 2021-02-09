package epam.task.third.entities;

import java.util.Objects;

public class Point {
    private Double xCoordinate;
    private Double yCoordinate;
    private Double zCoordinate;

    public Point(Double xCoordinate, Double yCoordinate, Double zCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
    }

    public Double getX() {
        return xCoordinate;
    }

    public void setX(Double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Double getY() {
        return yCoordinate;
    }

    public void setY(Double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Double getZ() {
        return zCoordinate;
    }

    public void setZ(Double zCoordinate) {
        this.zCoordinate = zCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return  xCoordinate.equals(point.xCoordinate)
                && yCoordinate.equals(point.yCoordinate)
                && zCoordinate.equals(point.zCoordinate);
    }

    @Override
    public String toString() {
        return "Point{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", zCoordinate=" + zCoordinate +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate, zCoordinate);
    }

}
