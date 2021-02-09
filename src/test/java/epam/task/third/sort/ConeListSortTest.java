package epam.task.third.sort;

import epam.task.third.comparators.ConeComparator;
import epam.task.third.comparators.ConeIdComparator;
import epam.task.third.comparators.ConeRadiusComparator;
import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ConeListSortTest {
    protected static final ConeListSort SORT = new ConeListSort();
    protected static final List<Cone> CONES_TEST = Arrays.asList(
            new Cone(new Point(0.0,0.0,0.0),
                    new Point(0.0,0.0,2.0),99.0, 99),
            new Cone(new Point(0.0,0.0,0.0),
                    new Point(0.0,0.0,2.0),32.0, 1),
            new Cone(new Point(0.0,0.0,0.0),
                    new Point(0.0,0.0,2.0),23.0, 23));
    protected static final List<Cone> EXPECTED_ID_TEST_CONES = Arrays.asList(
            new Cone(new Point(0.0,0.0,0.0),
                    new Point(0.0,0.0,2.0),32.0, 1),
            new Cone(new Point(0.0,0.0,0.0),
                    new Point(0.0,0.0,2.0),23.0, 23),
            new Cone(new Point(0.0,0.0,0.0),
                    new Point(0.0,0.0,2.0),99.0, 99));
    protected static final List<Cone> EXPECTED_RADIUS_TEST_CONES = Arrays.asList(
            new Cone(new Point(0.0,0.0,0.0),
                    new Point(0.0,0.0,2.0),23.0, 23),
            new Cone(new Point(0.0,0.0,0.0),
                    new Point(0.0,0.0,2.0),32.0, 1),
            new Cone(new Point(0.0,0.0,0.0),
                    new Point(0.0,0.0,2.0),99.0, 99));
    @Test
    public void testShouldSortListById() {
        //given
        ConeListSort coneListSort = new ConeListSort();
        ConeIdComparator comparator = new ConeIdComparator();
        //when
        List<Cone> actual = coneListSort.sort(CONES_TEST,comparator);
        //then
        Assert.assertEquals(EXPECTED_ID_TEST_CONES,actual);
    }
    @Test
    public void testShouldSortListByRadius() {
        //given
        ConeListSort coneListSort = new ConeListSort();
        ConeRadiusComparator comparator = new ConeRadiusComparator();
        //when
        List<Cone> actual = coneListSort.sort(CONES_TEST,comparator);
        //then
        Assert.assertEquals(EXPECTED_RADIUS_TEST_CONES,actual);
    }

}
