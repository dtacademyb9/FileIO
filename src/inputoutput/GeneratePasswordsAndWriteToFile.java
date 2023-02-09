package inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GeneratePasswordsAndWriteToFile {


    public static void main(String[] args) throws IOException {


        List<String> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {

           list.add(getRandomString());
        }

        System.out.println(list);

        Files.write(Path.of("src/inputoutput/passwordList.txt"), list );


    }


    public static String getRandomString(){
        String str = "";
        for (int i = 0; i < 5; i++) {
            str+=  (char)(97+ Math.random()*26);
        }

        return str;
    }
}
