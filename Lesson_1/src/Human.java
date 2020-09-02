public class Human implements Participants, Move{
    @Override
    public String toString() {
        return "Human";
    }

    @Override
    public void jump() {
        System.out.println("Human is jumping..");
    }

    @Override
    public void run() {
        System.out.println("Human is running..");
    }
}
