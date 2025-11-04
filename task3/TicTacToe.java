import java.util.Scanner;

public class TicTacToe {

    Scanner myScanner = new Scanner(System.in);

    public boolean status = true;

    private enum States {
        X,
        O,
        EMPTY
    }

    private States[][] coord = new States[3][3];

    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                coord[i][j] = States.EMPTY;
            }
        }
    }

    public void playGame() {
        int cell, i, j, counter;
        States symbol;
        while(true) {
            counter+=1;
            System.out.println("Какой игрок ходит первым? 1 или 2. Для выхода 0");
            int player = myScanner.nextInt();
            int firstPlayer = player;

            if(player == 0) break;

            while(status) {
                buildField();

                System.out.printf("Игрок %d - Введите клетку: ", player);
                cell = myScanner.nextInt();

                while(!verifyCell(cell)) {
                    System.out.printf("Клетка занята! Игрок %d - Введите клетку: ", player);
                    cell = myScanner.nextInt();
                }
                i = (cell - 1) / 3;
                j = (cell - 1) % 3;
                coord[i][j] = player==firstPlayer? States.X : States.O;
                symbol = coord[i][j];

                if(checkWin(symbol)) {
                    System.out.println("Победа!");
                    break;
                }

                player = player==1 ? 2: 1;

                if(counter==9) {
                    System.out.println("Ничья!");
                    break
                }
            }

            break;
        }
    }   

    public boolean verifyCell(int cell) {
        int i = (cell - 1) / 3;
        int j = (cell - 1) % 3;

        return coord[i][j] == States.EMPTY;
    }

    public void buildField() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("| %-5s", coord[i][j]);
            }
            System.out.println("|");
        }
    }

    public boolean checkWin(States symbol) {
        
        for (int i = 0; i < 3; i++) {
            if (coord[i][0] == symbol && coord[i][1] == symbol && coord[i][2] == symbol)
                return true;
        }

        for (int c = 0; c < 3; c++) {
            if (coord[0][c] == symbol && coord[1][c] == symbol && coord[2][c] == symbol)
                return true;
        }

        if (coord[0][0] == symbol && coord[1][1] == symbol && coord[2][2] == symbol) return true;
        if (coord[0][2] == symbol && coord[1][1] == symbol && coord[2][0] == symbol) return true;

        return false;
    }

}