package lab2.task2.app;

import lab2.task2.models.Color;
import lab2.task2.service.Board;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner sc = new Scanner(System.in);
        Color turn = Color.WHITE;

        System.out.println("Format: e2 e4  |  'quit' to exit");

        while (true) {
            board.draw();
            System.out.print(turn + " > ");
            String input = sc.nextLine().trim();

            if (input.equals("quit")) break;

            String[] parts = input.split(" ");
            if (parts.length != 2 || parts[0].length() != 2 || parts[1].length() != 2) {
                System.out.println("Bad input, try: e2 e4");
                continue;
            }

            char x1 = parts[0].charAt(0), x2 = parts[1].charAt(0);
            int  y1 = parts[0].charAt(1) - '0', y2 = parts[1].charAt(1) - '0';

            if (board.move(x1, y1, x2, y2, turn))
                turn = (turn == Color.WHITE) ? Color.BLACK : Color.WHITE;
        }

        sc.close();
    }
}