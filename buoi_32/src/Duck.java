public class Duck implements Swimmable, Flyable {

    @Override
    public void fly() {
        System.out.println("Duck is flying ...");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming ...");
    }
    
}
