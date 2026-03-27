package lab2.task2.service;

import lab2.task2.models.*;

public class Board {
    private Piece[][] grid = new Piece[8][8];

    public Board() {
        setup();
    }

    private void setup() {
        // Black
        grid[7][0] = new Rook(pos('a',8), Color.BLACK);
        grid[7][1] = new Knight(pos('b',8), Color.BLACK);
        grid[7][2] = new Bishop(pos('c',8), Color.BLACK);
        grid[7][3] = new Queen(pos('d',8), Color.BLACK);
        grid[7][4] = new King(pos('e',8), Color.BLACK);
        grid[7][5] = new Bishop(pos('f',8), Color.BLACK);
        grid[7][6] = new Knight(pos('g',8), Color.BLACK);
        grid[7][7] = new Rook(pos('h',8), Color.BLACK);
        for (int c = 0; c < 8; c++)
            grid[6][c] = new Pawn(pos((char)('a'+c), 7), Color.BLACK);

        // White
        grid[0][0] = new Rook(pos('a',1), Color.WHITE);
        grid[0][1] = new Knight(pos('b',1), Color.WHITE);
        grid[0][2] = new Bishop(pos('c',1), Color.WHITE);
        grid[0][3] = new Queen(pos('d',1), Color.WHITE);
        grid[0][4] = new King(pos('e',1), Color.WHITE);
        grid[0][5] = new Bishop(pos('f',1), Color.WHITE);
        grid[0][6] = new Knight(pos('g',1), Color.WHITE);
        grid[0][7] = new Rook(pos('h',1), Color.WHITE);
        for (int c = 0; c < 8; c++)
            grid[1][c] = new Pawn( pos((char)('a'+c), 2), Color.WHITE);
    }

    private Position pos(char x, int y) {
        return new Position(x, y);
    }

    private int col(char x) { return x - 'a'; }
    private int row(int y)  { return y - 1;   } // массив 0ден басталады сол үшін позияция - 1

    public Piece get(char x, int y) {
        return grid[row(y)][col(x)];
    }

    private void set(char x, int y, Piece p) {
        grid[row(y)][col(x)] = p;
    }

    public boolean move(char x1, int y1, char x2, int y2, Color turn) {
        Piece piece = get(x1, y1);

        if (piece == null) {
            System.out.println("No piece at " + x1 + y1);
            return false;
        }
        if (piece.getColor() != turn) {
            System.out.println("Not your piece");
            return false;
        }

        Position to = pos(x2, y2);
        Piece target = get(x2, y2);

        boolean legal;
        if (piece instanceof Pawn pawn) {
            legal = (target != null)
                    ? pawn.eat(to)
                    : pawn.isLegalMove(to);
        } else {
            legal = piece.isLegalMove(to);
        }

        if (!legal) {
            System.out.println("Illegal move");
            return false;
        }
        if (target != null && target.getColor() == turn) {
            System.out.println("Can't capture your own piece");
            return false;
        }

        piece.setPosition(to);
        if (piece instanceof Pawn pawn) pawn.markMoved();
        set(x2, y2, piece);
        set(x1, y1, null);
        return true;
    }
    // досканы консольга салу
    public void draw() {
        System.out.println("  a b c d e f g h");
        for (int r = 7; r >= 0; r--) {
            System.out.print((r + 1) + " ");
            for (int c = 0; c < 8; c++) {
                Piece p = grid[r][c];
                System.out.print(p == null ? ". " : symbol(p) + " ");
            }
            System.out.println(r + 1);
        }
        System.out.println("  a b c d e f g h");
    }

    // қаралар кіші әріп, ақтар үлкен әріп қайтарады
    private String symbol(Piece p) {
        String s = switch (p) {
            case King   k -> "K";
            case Queen  q -> "Q";
            case Rook   r -> "R";
            case Bishop b -> "B";
            case Knight n -> "N";
            case Pawn   pawn -> "P";
            default         -> "?";
        };
        return p.getColor() == Color.WHITE ? s : s.toLowerCase();
    }
}
