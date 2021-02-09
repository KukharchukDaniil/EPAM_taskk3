package epam.task.third.logic;

import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;
import epam.task.third.generator.IdGenerator;
import org.junit.Assert;
import org.junit.Test;

public class ConeLogicTest {
    private final IdGenerator generator = IdGenerator.getInstance();
    private static final Double DELTA = 0.001;
    @Test
    public void testIsConeShouldSpotTheFigureWhenFigureIsCone() {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,5.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre, apexPoint, radius, generator.getId());

        //when
        boolean actual = coneLogic.isCone(cone);

        //then
        Assert.assertTrue(actual);
    }
    @Test
    public void testIsConeShouldSpotTheFigureWhenFigureIsNotCone() {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(132.0,0.0,5.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre,apexPoint,radius, generator.getId());

        //when
        boolean actual = coneLogic.isCone(cone);

        //then
        Assert.assertFalse(actual);
    }
    @Test
    public void testShouldCalculateSquareOfConeSuccessfully() {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,5.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre,apexPoint,radius,generator.getId());
        Double expected = 189.61;
        //when
        Double actual = coneLogic.calculateSquare(cone);

        //then
        Assert.assertEquals(expected, actual, DELTA);

    }
    @Test
    public void testShouldCalculateConeSquareUnsuccessfully() {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,50.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre, apexPoint, radius, generator.getId());
        Double expected = 189.61;

        //when
        Double actual = coneLogic.calculateSquare(cone);

        //then
        Assert.assertNotEquals(expected,actual,DELTA);
    }

    @Test
    public void testShouldCalculateSquare() {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,2.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre, apexPoint, radius, generator.getId());
        Double expected = 2.0;
        //when
        Double actual = coneLogic.calculateSquare(cone);

        //then
        Assert.assertNotEquals(expected, actual, DELTA);
    }

    @Test
    public void testShouldCalculateConeVolumeSuccessfully() {
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,5.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre, apexPoint, radius, generator.getId());
        Double expected = 130.89969;

        //when
        Double actual = coneLogic.calculateVolume(cone);

        //then
        Assert.assertEquals(expected, actual, DELTA);
    }
    @Test
    public void testShouldCalculateConeVolumeUnsuccessfully() {
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,50.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre , apexPoint ,radius, generator.getId());
        Double expected = 130.89969;

        //when
        Double actual = coneLogic.calculateVolume(cone);

        //then
        Assert.assertNotEquals(expected, actual, DELTA);
    }
    @Test
    public void testShouldCalculateConesVolumeRatioWhenHeightIsValid() throws CalculationException {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,5.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre, apexPoint, radius, generator.getId());
        Double height = 2.0;
        Double expected = 0.27551016629;
        //when
        Double actual = coneLogic.calculateVolumeRatio(cone,height);
        //then
        Assert.assertEquals(expected,actual,DELTA);
    }

    @Test(expected = CalculationException.class)
    public void testShouldCalculateConesVolumeRatioWhenHeightIsInvalid() throws CalculationException {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,5.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre, apexPoint, radius, generator.getId());
        Double height = 5.0;
        Double expected = 0.27551016629;
        //when
        Double actual = coneLogic.calculateVolumeRatio(cone,height);
    }
}
