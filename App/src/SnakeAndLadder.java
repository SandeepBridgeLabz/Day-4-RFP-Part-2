public class SnakeAndLadder {

    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static int playGame(int position) {

        int dieNumber = (int) (Math.floor(Math.random() * 10) % 6) + 1;

        int option = (int) (Math.floor(Math.random() * 10) % 3);

        switch (option) {

            case NO_PLAY:
                break;

            case LADDER:

                if (position + dieNumber <= 100)
                    position += dieNumber;

                break;

            case SNAKE:
                position -= dieNumber;
                break;
        }

        if (position < 0)
            position = 0;

        return position;
    }

    public static void main(String[] args) {

        int player1Position = 0;
        int player2Position = 0;

        while (player1Position < 100 && player2Position < 100) {

            player1Position = playGame(player1Position);

            if (player1Position == 100) {
                System.out.println("Player 1 Won");
                break;
            }

            player2Position = playGame(player2Position);

            if (player2Position == 100) {
                System.out.println("Player 2 Won");
                break;
            }
        }
    }
}