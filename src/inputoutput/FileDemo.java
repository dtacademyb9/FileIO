package inputoutput;

import java.io.File;

public class FileDemo {


    public static void main(String[] args) {




         // Absolute path -> full path from the root
        // C:\Users\Nuclues\IdeaProjects\FileIO\src\inputoutput\desktop.txt

        File file = new File("C:\\Users\\Nuclues\\IdeaProjects\\FileIO\\src\\inputoutput\\desktop.txt");
        File file2 = new File("C:/Users/Nuclues/IdeaProjects/FileIO/src/inputoutput/desktop.txt");

        // Mac uses  /  for path
        // Windows uses both / and \

        // Relative path - path that is relative to the current folder where the file is
       // /user/documents/image/us.gif

        File path = new File("src/inputoutput/desktop.txt");

       if(path.exists()){
           path.delete();
       }



        File path3 = new File("src/inputoutput/cdsjbcjsd.txt");

        System.out.println(path3.exists());

        File path2 =  new File("projectLevelFile.txt");

        // To get a relative path to any file -> right click -> copy path -> path from content root




    }
}
