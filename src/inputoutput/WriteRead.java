package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteRead {


    public static void main(String[] args) throws FileNotFoundException {




        // File IO classes can be categorized to text IO and binary IO classes

        // .txt, .csv, .log
        // .mp4, .jpeg, .docx, .xlsx, .pdf


        PrintWriter pw = new PrintWriter("src/inputoutput/myfile.txt");


//        PrintWriter pw = new PrintWriter( new File("C:\\Users\\Nuclues\\Desktop\\First\\pass.txt"));

//        pw.println("Hello");

        for (int i = 0; i < 100; i++) {
            pw.println( getRandomString() );
//            pw.println("hello");
        }

        pw.close();





    }

    public static String getRandomString(){
        String str = "";
        for (int i = 0; i < 5; i++) {
          str+=  (char)(97+ Math.random()*26);
        }

        return str;
    }
}
