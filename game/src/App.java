import javax.swing.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        int boardWidth = 500;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(boardWidth, boardHeight);
        frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth,boardHeight);
        frame.add(snakeGame);
        snakeGame.requestFocus();

    }
}