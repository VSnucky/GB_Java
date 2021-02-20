public class Cat implements Participants, Move{
    @Override
    public String toString() {
        return "Cat";
    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping..");
    }

    @Override
    public void run() {
        System.out.println("Cat is running..");
    }
}
