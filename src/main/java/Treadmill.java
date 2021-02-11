public class Treadmill extends Obstacle {
    private static String type = "Treadmill";
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Participiant participant) {
        participant.run(this.distance);
    }
}
