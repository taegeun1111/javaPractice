package reStudy.day0410.IO.rw;

import reStudy.day0410.Path;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter(Path.ROOT_PATH+"/member.txt");){
            String s = "123213,rxwc,5fdga";
            fw.write(s);
            System.out.println("파일 저장에 성공했습니다.");
        } catch (IOException e) {
            System.out.println("실패했습니다.");
        }
    }
}
