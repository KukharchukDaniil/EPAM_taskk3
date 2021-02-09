package epam.task.third.generator;

public class IdGenerator {

    private static final Integer DEFAULT_ID = 0;
    private static IdGenerator instance;
    private Integer Id = DEFAULT_ID;

    private IdGenerator() {}

    public static IdGenerator getInstance() {
        if(instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }

    public Integer getId(){
        return Id++;
    }
}
