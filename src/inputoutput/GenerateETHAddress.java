package inputoutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateETHAddress {


    // 0x71C7656EC7ab88b098defB751B7401B5f6d8976F
    // Ox95fCca318A60ba763fBacB4a3B8edE0EFFeca999
    // Starts with 0x
    // 42 chars
    // combination of numbers and abcdefABCDEF


    // Create a method that generates a single eth address


    public static void main(String[] args) throws IOException {


//        System.out.println(generateETH());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            list.add(generateETH());
        }

//        System.out.println(list);
        Files.write(Path.of("src/inputoutput/ethAdresses.txt"), list);

        // Copy this file into a diff location

        Files.copy(Path.of("src/inputoutput/ethAdresses.txt"),
                Path.of("ethAdressesNEW.txt"));

    }

    public static String generateETH(){

        StringBuilder str = new StringBuilder("Ox");

        String abc = "0123456789abcdefABCDEF";
        for (int i = 0; i < 40; i++) {

            str.append(abc.charAt(new Random().nextInt(abc.length())));
        }

        return str.toString();

    }

}
