package lesson1_1;

public class Cat implements canJump,canRun {
    public int jumpHeight;
    @Override
    public void jump(int height) {
        if (jumpHeight > height){
            System.out.println("Я кот, я перепрыгнул!");
        } else {
            System.out.println("Я кот, не перепрыгнул!");
        }

    }
    public int runLength;
    @Override
    public void run(int length) {
        if (runLength > length) {
            System.out.println("Я кот, я пробежал!");
        } else {
            System.out.println("Я кот, я  не пробежал!");
        }

    }
}
