package reStudy.day0410.IO.stream;

import reStudy.day0410.Path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream(Path.ROOT_PATH+"/dog.txt")){
            int data = 0;
            while (data != -1){
                data = fis.read();
                System.out.write(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
