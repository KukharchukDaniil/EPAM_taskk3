package epam.task.third.creator;

import epam.task.third.data.DataException;
import epam.task.third.data.DataReader;
import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ConeCreatorTest {
    private static final List<String> VALID_TEST_DATA = Arrays.asList("0.0 0.0 0.0 0.0 0.0 5.0 5.0",
                                                                        "2.0 0.0 0.0 2.0 0.0 5.0 1.0","d");
    private static final String FILENAME_STRING = "test_string";
    private ConeParser parser;
    private ConeValidator validator;
    private DataReader dataReader;

    @Before
    public void before() {
        parser = Mockito.mock(ConeParser.class);
        validator = Mockito.mock(ConeValidator.class);
        dataReader = Mockito.mock(DataReader.class);
    }

    @Test
    public void testCreator() throws DataException {
        //given
        ConeCreator creator = new ConeCreator(parser,validator,dataReader);
        Point firstExpectedBaseCentre = new Point(0.0, 0.0, 0.0);
        Point firstExpectedApexPoint = new Point(0.0, 0.0, 5.0);
        Double firstConeRadius = 5.0;
        Point secondExpectedBaseCentre = new Point(2.0, 0.0, 0.0);
        Point secondExpectedApexPoint = new Point(2.0, 0.0, 1.0);
        Double secondConeRadius = 1.0;
        List<Cone> expected = Arrays.asList(new Cone(firstExpectedBaseCentre,firstExpectedApexPoint,firstConeRadius),
                                            new Cone(secondExpectedBaseCentre,secondExpectedApexPoint,secondConeRadius));
        //when
        when(dataReader.read(anyString())).thenReturn(VALID_TEST_DATA);
        when(validator.validate(anyString())).thenReturn(true,true,false);
        when(parser.parse(anyString())).thenReturn(new Cone(firstExpectedBaseCentre,firstExpectedApexPoint,firstConeRadius),
                new Cone(secondExpectedBaseCentre,secondExpectedApexPoint,secondConeRadius));
        List<Cone> actual = creator.create(FILENAME_STRING);

        //then

        Assert.assertEquals(expected,actual);
    }
}
