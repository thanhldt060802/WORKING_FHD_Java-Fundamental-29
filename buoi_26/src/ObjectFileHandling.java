import java.util.List;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadData'");
    }

    @Override
    public void saveData(List<Account> input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveData'");
    }
    
}
