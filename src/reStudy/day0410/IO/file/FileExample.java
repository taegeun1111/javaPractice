package reStudy.day0410.IO.file;

import reStudy.day0410.Path;

import java.io.File;
import java.io.IOException;

import static reStudy.day0410.Path.ROOT_PATH;

public class FileExample {
    public static void main(String[] args) {
        File file = new File(ROOT_PATH+"/hello");
        if(!file.exists()) file.mkdir();

        File file1 = new File(ROOT_PATH + "/hello/file1.txt");
        File file2 = new File(ROOT_PATH + "/hello/file2.txt");
        File file3 = new File(ROOT_PATH + "/hello/file3.txt");

        try {
            if(!file1.exists()) file1.createNewFile();
            if(!file2.exists()) file2.createNewFile();
            if(!file3.exists()) file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
