package epam.task.third.logic;

import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConeLogicTest {


    @Test
    public void testIsConeShouldSpotTheFigureWhenFigureIsCone() {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,5.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre,apexPoint,radius);

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
        Cone cone = new Cone(baseCentre,apexPoint,radius);

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
        Cone cone = new Cone(baseCentre,apexPoint,radius);
        Double expected = 189.61;
        //when
        Double actual = coneLogic.calculateSquare(cone);

        //then
        Assert.assertEquals(expected,actual,0.01);

    }
    @Test
    public void testShouldCalculateConeSquareUnsuccessfully() {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,50.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre,apexPoint,radius);
        Double expected = 189.61;

        //when
        Double actual = coneLogic.calculateSquare(cone);

        //then
        Assert.assertNotEquals(expected,actual,0.01);
    }

    @Test
    public void testShouldCalculateConeVolumeSuccessfully() {
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,5.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre,apexPoint,radius);
        Double expected = 130.89969;

        //when
        Double actual = coneLogic.calculateVolume(cone);

        //then
        Assert.assertEquals(expected,actual,0.01);
    }
    @Test
    public void testShouldCalculateConeVolumeUnsuccessfully() {
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,50.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre,apexPoint,radius);
        Double expected = 130.89969;

        //when
        Double actual = coneLogic.calculateVolume(cone);

        //then
        Assert.assertNotEquals(expected,actual,0.01);
    }
    @Test
    public void testShouldCalculateConesVolumeRatioWhenHeightIsValid() throws CalculationException {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,5.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre,apexPoint,radius);
        Double height = 2.0;
        Double expected = 0.27551016629;
        //when
        Double actual = coneLogic.calculateVolumeRatio(cone,height);
        //then
        Assert.assertEquals(expected,actual,0.01);
    }
    @Test(expected = CalculationException.class)
    public void testShouldCalculateConesVolumeRatioWhenHeightIsInvalid() throws CalculationException {
        //given
        ConeLogic coneLogic = new ConeLogic();
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,5.0);
        Double radius = 5.0;
        Cone cone = new Cone(baseCentre,apexPoint,radius);
        Double height = 5.0;
        Double expected = 0.27551016629;
        //when
        Double actual = coneLogic.calculateVolumeRatio(cone,height);
    }
}
