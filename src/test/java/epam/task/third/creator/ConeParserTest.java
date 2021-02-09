package epam.task.third.creator;

import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;
import epam.task.third.generator.IdGenerator;
import org.junit.Assert;
import org.junit.Test;

public class ConeParserTest {
    private static final String TEST_DATA = "0.0 0.0 0.0 0.0 0.0 5.0 5.0";
    private final IdGenerator generator = IdGenerator.getInstance();
    @Test
    public void testShouldParseCone(){
        //given
        Point baseCentre = new Point(0.0,0.0,0.0);
        Point apexPoint = new Point(0.0,0.0,5.0);
        Double radius = 5.0;
        Cone expected = new Cone(baseCentre, apexPoint, radius, generator.getId());
        ConeParser coneParser = new ConeParser();

        //when
        Cone actual = coneParser.parse(TEST_DATA);

        //than
        Assert.assertEquals(expected,actual);

    }
}
