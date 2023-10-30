package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public void demo(){
        File file = new File("one.txt") ;
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

