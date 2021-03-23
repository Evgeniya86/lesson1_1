package lesson1_1;

    public class Robot implements canRun, canJump {

        public int jumpHeight;

        @Override
        public void jump(int height) {
            if (jumpHeight > height) {
                System.out.println("Я робот, я перепрыгнул!");
            } else {
                System.out.println("Я робот, не перепрыгнул!");
            }

        }

        public int runLength;

        @Override
        public void run(int length) {
            if (runLength > length) {
                System.out.println("Я робот, я пробежал!");
            } else {
                System.out.println("Я робот, я  не пробежал!");
            }

        }
    }
