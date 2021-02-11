public class Cat implements Participiant {
    private static String type = "Cat";
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean onDistance;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }


    @Override
    public void run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.printf("%s %s успешно пробежал по беговой дорожке!\n", type, this.name);
        } else {
            System.out.printf("%s %s не смог пробежать по беговой дорожке!\n", type, this.name);
            this.onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (this.maxJumpHeight >= height) {
            System.out.printf("%s %s успешно перепрыгнул через стену!\n", type, this.name);
        } else {
            System.out.printf("%s %s не смог перепрыгнуть через стену!\n", type, this.name);
            this.onDistance = false;
        }
    }

    @Override
    public void info() {
        System.out.printf("%s %s может пробежать %dм и перепрыгнуть стену высотой %dм\n",type,this.name,this.maxRunDistance,this.maxJumpHeight);

    }

    public boolean isOnDistance() {
        return onDistance;
    }

}
