package reStudy.day0410.IO.objStream;

import reStudy.day0410.Path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LoadSnack {
    private static List<Snack> snackList = new ArrayList<>();

    public static void main(String[] args) {
        loadFile();
        for (Snack snack : snackList) {
            System.out.println(snack);
        }
    }

    private static void loadFile() {
        try(FileInputStream fis = new FileInputStream(Path.ROOT_PATH+"/snack.txt")){
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Snack> readObject = (List<Snack>) ois.readObject();
            snackList = readObject;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
