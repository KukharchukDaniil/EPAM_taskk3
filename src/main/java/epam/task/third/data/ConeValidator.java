package epam.task.third.data;

public class ConeValidator {
    private static final String REGEX_PATTERN = "^(X:[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?[\\s]+" +
                                                "Y:[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?[\\s]+" +
                                                "Z:[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?){2}[\\s]+" +
                                                "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$";
    public boolean validate(String string)
    {
        return string.matches(REGEX_PATTERN);
    }
}
