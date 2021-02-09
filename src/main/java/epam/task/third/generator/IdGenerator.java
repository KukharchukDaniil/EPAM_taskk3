package epam.task.third.generator;

public class IdGenerator {

    private static final Integer DEFAULT_ID = 0;
    private static IdGenerator generator;
    private Integer Id = DEFAULT_ID;

    private IdGenerator() {}

    public static IdGenerator getGenerator() {
        if(generator == null) {
            generator = new IdGenerator();
        }
        return generator;
    }

    public Integer getId(){
        return Id++;
    }
}
