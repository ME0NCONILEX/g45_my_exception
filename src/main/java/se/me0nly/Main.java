package se.me0nly;
import se.me0nly.data_access.NameService;
import se.me0nly.domain.Person;
import se.me0nly.fileIO.CSVReader_Writer;
import java.io.IOException;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {

        List<String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
        List <String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();
        List <String> lastNames = CSVReader_Writer.getLastNames();

        NameService nameService = new NameService(maleFirstNames, femaleFirstNames,lastNames);

        Person test = nameService.getNewRandomPerson();
        System.out.println(test);

    }
}
