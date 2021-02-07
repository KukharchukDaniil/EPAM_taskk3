package epam.task.third.data;

public class ConeValidator {
    private static final String REGEX_PATTERN = "([-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?\\s*){7}";



    public boolean validate(String string)
    {
        return string.matches(REGEX_PATTERN);
    }
}
