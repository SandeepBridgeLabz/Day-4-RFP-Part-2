public class SnakeAndLadder {

    public static void main(String[] args) {

        int dieNumber = (int) (Math.floor(Math.random() * 10) % 6) + 1;

        System.out.println("Die Number: " + dieNumber);
    }
}