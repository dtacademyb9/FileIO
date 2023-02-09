package inputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {


    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new FileReader("src/inputoutput/passwords.txt"));


//        System.out.println( bf.readLine());

        String line;
        while ( (line = bf.readLine()) != null ){

            System.out.println(line);
        }

        bf.close();





    }

}
