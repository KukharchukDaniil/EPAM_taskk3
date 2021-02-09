package epam.task.third.creator;

import epam.task.third.data.DataException;
import epam.task.third.data.DataReader;
import epam.task.third.entities.Cone;

import java.util.ArrayList;
import java.util.List;

public class ConeCreator {
    private ConeParser parser;
    private ConeValidator validator;
    private DataReader dataReader;

    public ConeCreator(ConeParser parser, ConeValidator validator, DataReader dataReader) {
        this.parser = parser;
        this.validator = validator;
        this.dataReader = dataReader;
    }

    public List<Cone> create(String filename) throws DataException {

        List<String> strings = dataReader.read(filename);
        List<Cone> cones = new ArrayList<>();
        for (String string : strings) {
            if(validator.validate(string)){
                Cone parsedCone = parser.parse(string);
                cones.add(parsedCone);
            }
        }
        return cones;
    }
}
