package filehandling;
import java.util.List;

import entities.Account;

public interface DataFileHandling {

    public abstract void loadData(List<Account> output);

    public abstract void saveData(List<Account> input);
    
}
