public class Cat implements Movable, Edible, Eat{

    @Override
    public void eat() {
        System.out.println("I can eat somebody");
    }

    @Override
    public void beEaten() {
        System.out.println("Don't eat me");
    }

    @Override
    public void move() {
        System.out.println("I can moving");
    }
}
