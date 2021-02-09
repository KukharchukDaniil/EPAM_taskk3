package epam.task.third.creator;


import epam.task.third.creator.ConeValidator;
import org.junit.Assert;
import org.junit.Test;

public class ConeValidatorTest {
    private static final String VALID_STRING =  "2.0 2.0 0.0 " +
                                                "2.0 2.0 0.0 " +
                                                "4.0";
    private static final String INVALID_STRING =  "2.0 2.0 0.0 " +
            "2.0 2.0 0.0 " +
            "-4.0";

    @Test
    public void testShouldValidateStringWhenStringIsValid(){
        //given
        ConeValidator coneValidator = new ConeValidator();

        //when
        boolean actual = coneValidator.validate(VALID_STRING);

        //than
        Assert.assertTrue(actual);
    }
    @Test
    public void testShouldValidateStringWhenStringIsInvalid(){
        //given
        ConeValidator coneValidator = new ConeValidator();

        //when
        boolean actual = coneValidator.validate(INVALID_STRING);

        //than
        Assert.assertFalse(actual);
    }

}
