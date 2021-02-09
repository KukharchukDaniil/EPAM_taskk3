package epam.task.third.creator;

import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;
import epam.task.third.generator.IdGenerator;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ConeParser {
    private static final String DELIMITERS = "\\s";
    public Cone parse(String string){
        String[] values = string.split(DELIMITERS);
        Double baseCentreXCoordinate = Double.valueOf(values[0]);
        Double baseCentreYCoordinate = Double.valueOf(values[1]);
        Double baseCentreZCoordinate = Double.valueOf(values[2]);
        Point baseCentre = new Point(baseCentreXCoordinate,baseCentreYCoordinate,baseCentreZCoordinate);
        Double apexPointXCoordinate = Double.valueOf(values[3]);
        Double apexPointYCoordinate = Double.valueOf(values[4]);
        Double apexPointZCoordinate = Double.valueOf(values[5]);
        Point apexPoint = new Point(apexPointXCoordinate,apexPointYCoordinate,apexPointZCoordinate);
        Double radius = Double.valueOf(values[6]);
        return new Cone(baseCentre,apexPoint,radius);
    }
}
