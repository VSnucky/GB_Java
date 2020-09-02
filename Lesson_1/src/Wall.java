public class Wall implements Obstacle{
    @Override
    public void pass(Participants participants) {
        System.out.println(participants + " перепрыгнул");
    }
}
