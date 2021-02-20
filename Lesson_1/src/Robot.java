public class Robot implements Participants, Move{
    @Override
    public String toString() {
        return "Robot";
    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping..");
    }

    @Override
    public void run() {
        System.out.println("Robot is running..");
    }
}
