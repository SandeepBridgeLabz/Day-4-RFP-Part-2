public class SnakeAndLadder {

    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {

        int playerPosition = 0;

        while (playerPosition < 100) {

            int dieNumber = (int) (Math.floor(Math.random() * 10) % 6) + 1;

            int option = (int) (Math.floor(Math.random() * 10) % 3);

            switch (option) {

                case NO_PLAY:
                    break;

                case LADDER:
                    playerPosition += dieNumber;
                    break;

                case SNAKE:
                    playerPosition -= dieNumber;
                    break;
            }

            if (playerPosition < 0)
                playerPosition = 0;
        }

        System.out.println("Player reached position 100");
    }
}