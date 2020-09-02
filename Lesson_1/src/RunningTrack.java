public class RunningTrack implements Obstacle{
    @Override
    public void pass(Participants participants) {
        System.out.println(participants.toString() + " пробежал");
    }

}
