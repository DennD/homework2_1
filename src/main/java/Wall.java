public class Wall extends Obstacle {
    private static String type = "Wall";
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public void overcome(Participiant participant) {
        participant.jump(this.heigth);

    }
}

