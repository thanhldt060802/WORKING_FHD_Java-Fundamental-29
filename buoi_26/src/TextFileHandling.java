import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TextFileHandling implements DataFileHandling {

    private String pathFile;

    public TextFileHandling(String pathFile) {
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
        return "TextFileHandling [pathFile=" + pathFile + "]";
    }

    @Override
    public void loadData(List<Account> output) {
        File file = new File(this.pathFile);
        try (
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
        ) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] rawInfos = line.split(", ");
                
                String id = rawInfos[0];
                String pin = rawInfos[1];
                int balance = Integer.parseInt(rawInfos[2]);
                Account acc = new Account(id, pin, balance);
                output.add(acc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveData(List<Account> input) {
        File file = new File(this.pathFile);
        try (
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
        ) {
            for (Account acc : input) {
                bw.write(String.format("%s, %s, %d", acc.getId(), acc.getPin(), acc.getBalance()));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}