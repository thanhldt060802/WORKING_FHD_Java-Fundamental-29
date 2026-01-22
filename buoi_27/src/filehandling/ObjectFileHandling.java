package filehandling;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import entities.Account;

public class ObjectFileHandling implements DataFileHandling {

    private String pathFile;

    public ObjectFileHandling(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    @Override
    public String toString() {
        return "ObjectFileHandling [pathFile=" + pathFile + "]";
    }

    @Override
    public void loadData(List<Account> output) {
        File file = new File(this.pathFile);
        try (
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            while (true) {
                Object obj = ois.readObject();

                if (obj instanceof Account) {
                    output.add((Account)obj);
                }
            }
        } catch (EOFException e) {
            // Done
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveData(List<Account> input) {
        File file = new File(this.pathFile);
        try (
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            for (Account acc : input) {
                oos.writeObject(acc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
