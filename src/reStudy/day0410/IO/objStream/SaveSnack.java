package reStudy.day0410.IO.objStream;

import reStudy.day0410.Path;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import static reStudy.day0410.IO.objStream.Snack.Taste.*;

public class SaveSnack {
    private static List<Snack> snackList = new ArrayList<>();

    public static void main(String[] args) {
        snackList.add(new Snack("콘칲",1970,1500, GOOD));
        snackList.add(new Snack("사브레",1980,2500, BAD));
        snackList.add(new Snack("오징어집",1985,1800, SOSO));
        
        saveFile();
    }

    private static void saveFile() {
        try(FileOutputStream fos = new FileOutputStream(Path.ROOT_PATH+"/snack.txt")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);
        } catch (FileNotFoundException e) {
            System.out.println("저장 실패");
        } catch (IOException e) {
            System.out.println("저장 실패");
        }
    }
}
