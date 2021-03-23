package lesson1_1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Human human = new Human();
        Robot robot = new Robot();
        Wall wall = new Wall();
        wall.height = 10;
        cat.jumpHeight = 11;
        human.jumpHeight = 5;
        robot.jumpHeight = 20;
        Track track = new Track();
        track.length = 200;
        cat.runLength =150;
        human.runLength = 80;
        robot.runLength = 250;

        wall.anybodyJumps(cat);
        track.anybodyRuns(cat);
        wall.anybodyJumps(human);
        track.anybodyRuns(human);
        wall.anybodyJumps(robot);
        track.anybodyRuns(robot);
    }
}
