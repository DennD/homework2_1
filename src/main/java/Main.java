public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("T-2000", 50000, 5);
        Human human1 = new Human("Denis", 10000, 3);
        Cat cat1 = new Cat("Leopold", 5000, 1);

        Wall wall1 = new Wall(3);
        Treadmill treadmill1 = new Treadmill(3000);
        Treadmill treadmill2 = new Treadmill(15000);

        Obstacle[] obstacles = {wall1, treadmill1, treadmill2};
        Participiant[] participiants = {robot1, human1, cat1};

        for (Participiant character: participiants) {
            character.info();
        }

        for (int i = 0; i < participiants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (participiants[i].isOnDistance()) {
                    obstacles[j].overcome(participiants[i]);
                } else {
                    break;
                }

            }
        }


    }


}
