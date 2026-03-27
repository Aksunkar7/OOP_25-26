package lab2.task2.app;

import lab2.task2.models.Color;
import lab2.task2.service.*;

public class BoardTest {
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        test_initialSetup();
        test_pawn_validFirstMove();
        test_pawn_invalidMove();
        test_wrongColor();
        test_noPiece();
        test_captureOwnPiece();
        test_pawn_capture_diagonal();
        test_knight_jump();

        System.out.println("\nPassed: " + passed + " | Failed: " + failed);
    }

    static void check(String name, boolean result) {
        if (result) { System.out.println("✅ " + name); passed++; }
        else        { System.out.println("❌ " + name); failed++; }
    }

    static void test_initialSetup() {
        Board board = new Board();
        check("initialSetup_piecesInPlace",
                board.get('e', 1) != null &&
                        board.get('e', 8) != null &&
                        board.get('e', 4) == null
        );
    }

    static void test_pawn_validFirstMove() {
        Board board = new Board();
        check("pawn_validFirstMove",
                board.move('e', 2, 'e', 4, Color.WHITE)
        );
    }

    static void test_pawn_invalidMove() {
        Board board = new Board();
        check("pawn_invalidMove_blocked",
                !board.move('e', 2, 'e', 5, Color.WHITE)
        );
    }

    static void test_wrongColor() {
        Board board = new Board();
        check("move_wrongColor_fails",
                !board.move('e', 7, 'e', 5, Color.WHITE)
        );
    }

    static void test_noPiece() {
        Board board = new Board();
        check("move_noPiece_fails",
                !board.move('e', 4, 'e', 5, Color.WHITE)
        );
    }

    static void test_captureOwnPiece() {
        Board board = new Board();
        check("move_captureOwnPiece_fails",
                !board.move('a', 1, 'a', 2, Color.WHITE)
        );
    }

    static void test_pawn_capture_diagonal() {
        Board board = new Board();
        board.move('e', 2, 'e', 4, Color.WHITE);
        board.move('d', 7, 'd', 5, Color.BLACK);
        boolean moved = board.move('e', 4, 'd', 5, Color.WHITE);
        check("pawn_capture_diagonal",
                moved &&
                        board.get('e', 4) == null &&
                        board.get('d', 5) != null
        );
    }

    static void test_knight_jump() {
        Board board = new Board();
        check("knight_jumpOver_isLegal",
                board.move('g', 1, 'f', 3, Color.WHITE)
        );
    }
}