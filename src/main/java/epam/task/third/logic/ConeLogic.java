package epam.task.third.logic;

import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;

public class ConeLogic {
    private Double calculateHeight(Cone cone){
        Point apexPoint = cone.getApexPoint();
        Double apexZCoordinate = apexPoint.getZ();
        Point centerPoint = cone.getBaseCentre();
        Double centerZCoordinate = centerPoint.getZ();
        return Math.abs(apexZCoordinate - centerZCoordinate);
    }
    private Double calculateHypo(Cone cone){
        Double radius = cone.getRadius();
        Double height = calculateHeight(cone);
        return Math.hypot(radius,height);
    }
    public Double calculateSquare(Cone cone){
        Double height = calculateHeight(cone);
        Double hypo = calculateHypo(cone);
        Double radius = cone.getRadius();
        return Math.PI*radius*(radius+hypo);
    }
    public Double calculateVolume(Cone cone){
        Double height = calculateHeight(cone);
        Double radius = cone.getRadius();
        return Math.PI*Math.pow(radius,2)*height/3.0;
    }
    public Double calculateVolumeRatio(Cone cone, Double height) throws CalculationException {
        if(height >= calculateHeight(cone)){
            throw new CalculationException("Invalid height value");
        }

        Point baseCentre = cone.getBaseCentre();
        Point changedBaseCentre = new Point(baseCentre.getX(), baseCentre.getY(), baseCentre.getZ()+height);
        Cone changedCone = new Cone(changedBaseCentre, cone.getApexPoint(), cone.getRadius());

        Double initialConeVolume = calculateVolume(cone);
        Double changedConeVolume = calculateVolume(changedCone);
        return changedConeVolume/(initialConeVolume-changedConeVolume);
    }
}
