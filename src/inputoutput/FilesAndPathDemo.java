package inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FilesAndPathDemo {


    public static void main(String[] args) throws IOException {


//        Files and Path classes were added in Java 7 to facilitate working with files
        // You can use these 2 classes exclusively to read from and write to a file
        // They are more readable and concise and methods are static


        Path path = Path.of("src/inputoutput/newFile.txt");  // represents the path to a file
//        Files.createFile(path); // creates a file
//
        System.out.println( Files.isHidden(path));
        System.out.println( Files.isReadable(path));
        System.out.println( Files.exists(path));


        Files.delete(path);  // deletes the existing file

        // write a single String to a file
//        Files.writeString(path, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
//
//        // Multiline string can also be passed (""" """)
//        Files.writeString(path, """
//                BufferedReader bf = new BufferedReader(new FileReader("src/inputoutput/passwords.txt"));
//
//
//                //        System.out.println( bf.readLine());
//
//                        String line;
//                        while ( (line = bf.readLine()) != null ){
//
//                            System.out.println(line);
//                        }
//
//                        bf.close();""");


        // A collection content can also be written to file with write() method

        Files.write(path, List.of("hello", "hi", "hola"));

        // You can also use streams with lines method
//        Stream<String> lines = Files.lines(path);\



    }
}
