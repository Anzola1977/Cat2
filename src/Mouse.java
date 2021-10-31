public class Mouse implements Movable, Edible{

    @Override
    public void beEaten() {
        System.out.println("Don't eat me");
    }

    @Override
    public void move() {
        System.out.println("I can moving");
    }
}
