package inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadWithFilesClass {


    public static void main(String[] args) throws IOException {


//        String str = Files.readString(Path.of("src/inputoutput/passwordList.txt"));  // returns the content of the file as a single string
//
//        System.out.println(str);


        List<String> list = Files.readAllLines(Path.of("src/inputoutput/passwordList.txt"));

        for (String each : list) {
            System.out.println(each.toUpperCase());
        }
    }
}
