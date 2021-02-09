package epam.task.third.repository;

import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;
import epam.task.third.generator.IdGenerator;
import epam.task.third.specifications.sorting.ConeSortingSpecification;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ConeSortingSpecificationTest {
    private static final Map<Integer, Cone> CONE_MAP = new HashMap<>();
    private static final IdGenerator GENERATOR = IdGenerator.getInstance();
    private final ConeSortingSpecification specification = createSpecification();
    @BeforeClass
    public static void fillTheMap() {
        Cone firstCone = new Cone(new Point(0.0,0.0,0.0),
                new Point(0.0,0.0,2.0),2.0, 99);
        Cone secondCone = new Cone(new Point(0.0,0.0,0.0),
                new Point(0.0,0.0,32.0),4.0, GENERATOR.getId());
        Cone thirdCone = new Cone(new Point(0.0,0.0,0.0),
                new Point(0.0,0.0,32.0),333.0, GENERATOR.getId());
        Cone fourthCone = new Cone(new Point(0.0,0.0,0.0),
                new Point(0.0,0.0,22.0),333.0, GENERATOR.getId());
        CONE_MAP.put(firstCone.getId(),firstCone);
        CONE_MAP.put(secondCone.getId(),secondCone);
        CONE_MAP.put(thirdCone.getId(),thirdCone);
        CONE_MAP.put(fourthCone.getId(),fourthCone);
    }
    @After
    public void clearMap() {
        CONE_MAP.clear();
    }
    @Test
    public void testShouldReturnSpecifiedConesList() {
        //given
        ConeRepository repository = new ConeRepository(CONE_MAP);
        List<Cone> expected = Arrays.asList( new Cone(new Point(0.0,0.0,0.0),
                new Point(0.0,0.0,2.0),2.0, 99));
        //when
        List<Cone> actual = repository.query(specification);

        //then
        Assert.assertEquals(expected,actual);

    }
    public abstract ConeSortingSpecification createSpecification();
}
