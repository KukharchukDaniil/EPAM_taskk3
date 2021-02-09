package epam.task.third.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataReaderTest {
    private static final String INVALID_FILE = "src/main/resources/invalid_filename";
    private static final String VALID_FILE = "src/test/java/resources/dataReader_test";
    private static final String EMPTY_FILE = "src/test/java/resources/emptyFile";

    @Test
    public void testShouldReadDataWhenFileExistsAndValid() throws DataException {
        //given
        DataReader dataReader = new DataReader();
        List<String> expected = Arrays.asList("0.0 0.0 0.0 0.0 0.0 5.0 5.0", "2.0 0.0 0.0 2.0 0.0 5.0 1.0",
                "6.0 0.0 0.0 6.0 0.0 5.0 -5.0", "6.0 7.0 0.0 6.0 7.z 5.0 5.0", "0dddddddd.0 0.0 0.0 0.0 0.0 5.0 5.0");

        //when
        List<String> actual = dataReader.read(VALID_FILE);

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testShouldReadDataWhenFileExistsAndEmpty() throws DataException {
        //given
        DataReader dataReader = new DataReader();
        List<String> expected = new ArrayList<>();

        //when
        List<String> actual = dataReader.read(EMPTY_FILE);

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test(expected = DataException.class)
    public void testShouldTestDataReaderWhenFilepathIsNotValid() throws DataException {
        //given
        DataReader reader = new DataReader();

        //when
        List<String> actual = reader.read(INVALID_FILE);
    }
}
