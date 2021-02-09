package epam.task.third.logic;

import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;

public class ConeLogic {
    private Double calculateHeight(Cone cone) {
        Point apexPoint = cone.getApexPoint();
        Double apexZCoordinate = apexPoint.getZ();
        Point centerPoint = cone.getBaseCentre();
        Double centerZCoordinate = centerPoint.getZ();
        return Math.abs(apexZCoordinate - centerZCoordinate);
    }
    private Double calculateHypo(Cone cone) {
        Double radius = cone.getRadius();
        Double height = calculateHeight(cone);
        return Math.hypot(radius,height);
    }
    public boolean isCone(Cone cone) {
        Point baseCentre = cone.getBaseCentre();
        Double baseCentreX = baseCentre.getX();
        Double baseCentreY = baseCentre.getY();
        Point apexPoint = cone.getApexPoint();
        Double apexPointX = apexPoint.getX();
        Double apexPointY = apexPoint.getX();
        Double radius = cone.getRadius();
        return baseCentreX.equals(apexPointX) && baseCentreY.equals(apexPointY)&& radius>0.0;
    }
    public Double calculateSquare(Cone cone) {
        Double height = calculateHeight(cone);
        Double hypo = calculateHypo(cone);
        Double radius = cone.getRadius();
        return Math.PI*radius*(radius+hypo);
    }
    public Double calculateVolume(Cone cone) {
        Double height = calculateHeight(cone);
        Double radius = cone.getRadius();
        return Math.PI*Math.pow(radius,2)*height/3.0;
    }
    public Double calculateVolumeRatio(Cone cone, Double height) throws CalculationException {
        if(height.compareTo(calculateHeight(cone)) >= 0) {
            throw new CalculationException("Invalid height value");
        }
        Double initialConeHeight = calculateHeight(cone);
        Double initialConeRadius = cone.getRadius();
        Point initialBaseCentre =  cone.getBaseCentre();
        Point upperConeBaseCentre = new Point(initialBaseCentre.getX(), initialBaseCentre.getY(),
                                    initialBaseCentre.getZ()+height);
        Double changedConeRadius = (initialConeHeight-height)*initialConeRadius/initialConeHeight;
        Cone changedCone = new Cone(upperConeBaseCentre, cone.getApexPoint(), changedConeRadius);
        Double initialConeVolume = calculateVolume(cone);
        Double upperConeVolume = calculateVolume(changedCone);
        Double lowerConeVolume = initialConeVolume-upperConeVolume;
        return upperConeVolume/lowerConeVolume;
    }
}
