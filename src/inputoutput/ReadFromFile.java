package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner scanner = new Scanner(new File("src/inputoutput/passwords.txt"));

//        System.out.println( scanner.next());
//        System.out.println( scanner.next());
//        System.out.println( scanner.next());
//        System.out.println( scanner.nextLine());


        List<String> passwords = new ArrayList<>();

        while (scanner.hasNext()){
            passwords.add(scanner.nextLine());
        }


        System.out.println(passwords);

        scanner.close();


    }
}
