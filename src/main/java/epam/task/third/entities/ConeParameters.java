package epam.task.third.entities;

import java.util.Objects;

public class ConeParameters {
    private Double coneSquare;
    private Double coneVolume;

    public ConeParameters() {
        coneSquare = 0.0;
        coneVolume = 0.0;
    }

    public ConeParameters(Double coneSquare, Double coneVolume) {
        this.coneSquare = coneSquare;
        this.coneVolume = coneVolume;
    }

    public Double getConeSquare() {
        return coneSquare;
    }

    public void setConeSquare(Double coneSquare) {
        this.coneSquare = coneSquare;
    }

    public Double getConeVolume() {
        return coneVolume;
    }

    public void setConeVolume(Double coneVolume) {
        this.coneVolume = coneVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConeParameters that = (ConeParameters) o;
        return coneSquare.equals(that.coneSquare) && coneVolume.equals(that.coneVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coneSquare, coneVolume);
    }

    @Override
    public String toString() {
        return "ConeParameters{" +
                "coneSquare=" + coneSquare +
                ", coneVolume=" + coneVolume +
                '}';
    }
}
