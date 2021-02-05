package epam.task.third.data;


import org.junit.Assert;
import org.junit.Test;

public class ConeValidatorTest {
    private static final String VALID_STRING =  "X:2.0 Y:2.0 Z:0.0 " +
                                                "X:2.0 Y:2.0 Z:0.0 " +
                                                "4.0";
    @Test
    public void testShouldValidateStringWhenStringIsValid(){
        //given
        ConeValidator coneValidator = new ConeValidator();

        //when
        boolean actual = coneValidator.validate(VALID_STRING);

        //than
        Assert.assertTrue(actual);
    }

}
