public class Main {
    public static void main(String[] args) {
        Participants[] participants = {new Human(), new Cat(), new Robot()};
        Obstacle[] obstacle = {new RunningTrack(), new Wall()};
        for (int i = 0; i < participants.length ; i++) {
            for (int j = 0; j < obstacle.length; j++) {
                obstacle[j].pass(participants[i]);
            }
        }

    }
}
