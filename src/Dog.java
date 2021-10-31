public class Dog implements Movable, Eat{

    @Override
    public void eat() {
        System.out.println("I can eat somebody");
    }

    @Override
    public void move() {
        System.out.println("I can moving");
    }
}
