package lesson1_1;

    public class Human implements canRun, canJump {

        public int jumpHeight;

        @Override
        public void jump(int height) {
            if (jumpHeight > height) {
                System.out.println("Я человек, я перепрыгнул!");
            } else {
                System.out.println("Я человек, не перепрыгнул!");
            }

        }

        public int runLength;

        @Override
        public void run(int length) {
            if (runLength > length) {
                System.out.println("Я человек, я пробежал!");
            } else {
                System.out.println("Я человек, я  не пробежал!");
            }

        }
    }
