package epam.task.third.data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    private static final Logger LOGGER = LogManager.getLogger();
    public List<String> read(String filename) throws DataException {
        BufferedReader bufferedReader = null;
        ArrayList<String> strings = new ArrayList<>();
        try{
            bufferedReader = new BufferedReader(new FileReader(filename));
            String line = bufferedReader.readLine();
            while(line != null){
                strings.add(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            throw new DataException(e.getMessage(),e);
        }finally {
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage(),e);
                }
            }
        }
        return strings;
    }

}
