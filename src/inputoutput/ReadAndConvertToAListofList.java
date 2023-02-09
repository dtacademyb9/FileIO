package inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadAndConvertToAListofList {


    public static void main(String[] args) throws IOException {


        List<String> rows = Files.readAllLines(Path.of("customers.csv"));


        List<List<String>> converted =  new ArrayList<>();

        for (String row : rows) {
            List<String> each = Arrays.asList(row.split(","));
            converted.add(each);
        }

        System.out.println(converted);
        System.out.println(converted.get(1).get(2));






    }
}
