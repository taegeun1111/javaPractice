package reStudy.day0410.IO.stream;

import reStudy.day0410.Path;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {
        String msg = "멍멍이는 왈왈 \n하하호호";

        try(FileOutputStream fos = new FileOutputStream(Path.ROOT_PATH+"/dog.txt")){
            fos.write(msg.getBytes());
            System.out.println("파일 저장에 성공했습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("파일 저장에 실패했습니다.");
        } catch (IOException e) {
            System.out.println("출력 시스템에 문제가 생겼습니다.");
        }
    }
}
