public class MySqlAdapter implements IReader, IWriter {

    @Override
    public void write() {
        System.out.println("Writing data to MySQL database ...");
    }

    @Override
    public void read() {
        System.out.println("Reading data in MySQL database ...");
    }
    
}