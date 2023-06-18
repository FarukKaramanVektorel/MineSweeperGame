import java.util.Scanner;

public class MineSweeper {
    private int rowSize;
    private int colSize;
    private int[][] mineField;
    private boolean[][] revealed;
    private boolean gameOver;
    private int remainingCells;

    public MineSweeper(int rowSize, int colSize) {
        this.rowSize = rowSize;
        this.colSize = colSize;
        this.mineField = new int[rowSize][colSize];
        this.revealed = new boolean[rowSize][colSize];
        this.gameOver = false;
        this.remainingCells = rowSize * colSize;

        initializeMineField();
    }

    private void initializeMineField() {
        int totalMines = rowSize * colSize / 4;
        int minesPlaced = 0;

        while (minesPlaced < totalMines) {
            int randomRow = (int) (Math.random() * rowSize);
            int randomCol = (int) (Math.random() * colSize);

            if (mineField[randomRow][randomCol] != -1) {
                mineField[randomRow][randomCol] = -1;
                minesPlaced++;
            }
        }
    }

    private boolean isValidCell(int row, int col) {
        return row >= 0 && row < rowSize && col >= 0 && col < colSize;
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;

                if (isValidCell(newRow, newCol) && mineField[newRow][newCol] == -1) {
                    count++;
                }
            }
        }

        return count;
    }

    private void revealCell(int row, int col) {
        if (!isValidCell(row, col) || revealed[row][col]) {
            return;
        }

        revealed[row][col] = true;
        remainingCells--;

        if (mineField[row][col] == -1) {
            gameOver = true;
            return;
        }

        if (countAdjacentMines(row, col) == 0) {
            revealCell(row - 1, col); // up
            revealCell(row + 1, col); // down
            revealCell(row, col - 1); // left
            revealCell(row, col + 1); // right
            revealCell(row - 1, col - 1); // top-left
            revealCell(row - 1, col + 1); // top-right
            revealCell(row + 1, col - 1); // bottom-left
            revealCell(row + 1, col + 1); // bottom-right
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver && remainingCells > 0) {
            System.out.print("Enter row number (0-" + (rowSize - 1) + "): ");
            int row = scanner.nextInt();

            System.out.print("Enter column number (0-" + (colSize - 1) + "): ");
            int col = scanner.nextInt();

            if (!isValidCell(row, col) || revealed[row][col]) {
                System.out.println("Invalid cell! Try again.");
                continue;
            }

            revealCell(row, col);
            printMineField();
        }

        if (gameOver) {
            System.out.println("Game over! You stepped on a mine.");
        } else {
            System.out.println("Congratulations! You won the game.");
        }

        scanner.close();
    }

    private void printMineField() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (revealed[i][j]) {
                    if (mineField[i][j] == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(countAdjacentMines(i, j) + " ");
                    }
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        MineSweeper game = new MineSweeper(rows, cols);
        game.playGame();

        scanner.close();
    }
}
