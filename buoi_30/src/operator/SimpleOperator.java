package operator;
public interface SimpleOperator<T> {

    public abstract void showAll();

    public abstract void add(T obj);

    public abstract void update(T obj);

    public abstract void remove(T obj);

    public abstract T search(T obj);
    
}
