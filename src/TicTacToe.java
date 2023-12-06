import java.util.*;

public class TicTacToe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);
        System.out.println("Enter your placement (1-9): ");
        int pos = sc.nextInt();
        System.out.println(pos);
        
        placePiece(gameBoard, pos, "player");
        Random rand = new Random();

        int cpuPos = rand.nextInt(9) + 1;
        placePiece(gameBoard, cpuPos, "cpu");

        printGameBoard(gameBoard);
    }

    //print the board game
    public static void printGameBoard(char[][] gameBoard){
        for(char [] a : gameBoard){
            for(char c : a){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    //user and cpu input
    public static void placePiece(char[][] gameBoard, int pos, String user){
        char symbol = ' ';
        if(user.equalsIgnoreCase("player")){
            symbol = 'X';
        }else if(user.equalsIgnoreCase("cpu")){
            symbol = 'O';
        }
        switch(pos){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
            case 3:
                gameBoard[0][4] = symbol;
            case 4:
                gameBoard[2][0] = symbol;
            case 5:
                gameBoard[2][2] = symbol;
            case 6:
                gameBoard[2][4] = symbol;
            case 7:
                gameBoard[4][0] = symbol;
            case 8:
                gameBoard[4][2] = symbol;
            case 9:
                gameBoard[4][4] = symbol;
            default:
                break;
        }
    }
}
