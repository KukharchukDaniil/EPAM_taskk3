package epam.task.third.observer;

import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class ConeObservableTest {
    private final ConeParametersObserver parametersObserver = ConeParametersObserver.getInstance();
    private static final Cone TEST_CONE = new Cone(new Point(0.0, 0.0, 0.0),
            new Point(0.0, 0.0, 2.0),2.0);
    @Test
    public void testShouldAddObserver() {
        //given
        ConeObservable coneObservable = new ConeObservable(TEST_CONE);
        //when
        coneObservable.addObserver(parametersObserver);
        //then
        Assert.assertFalse(coneObservable.isEmpty());
    }
    @Test
    public void testShouldRemoveObserver() {
        //given
        ConeObservable coneObservable = new ConeObservable(TEST_CONE,parametersObserver);
        //when
        coneObservable.removeObserver(parametersObserver);
        //then
        Assert.assertTrue(coneObservable.isEmpty());
    }
}
