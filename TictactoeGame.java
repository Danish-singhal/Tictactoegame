import java.util.Scanner;

public class TictactoeGame {
    public static void main(String[] args) {
        char [][]board=new char[3][3];
        for (int row=0;row< board.length;row++){
            for (int col=0;col<board[0].length;col++){
                board[row][col]=' ';
            }
        }
        char player='x';
        boolean Gameover=false;
        Scanner input=new Scanner(System.in);
        while(!Gameover){
            printboard(board);
            System.out.println("player " +player+ " enter");
            int row=input.nextInt();
            int col=input.nextInt();
          if (board[row][col]==' '){
              board[row][col]=player;
              Gameover=haveWon(board,player);
              if (Gameover){
                  System.out.println("player "+ player+" has won. ");
              }
              else{
                  if (player == 'x') {
                      player='o';
                  }else{
                      player='x';
                  }
              }
          }
          else{
              System.out.println("Invalid move.Try again");
          }
        }

    }
    static boolean haveWon(char[][]board,int player){
        for (int row=0;row<board.length;row++){
            if (board[row][0]==player&&board[row][1]==player&&board[row][2]==player){
                return true;
            }

        }
        for (int col=0;col<board.length;col++){
            if (board[0][col]==player&&board[1][col]==player&&board[2][col]==player){
                return true;
            }

        }
        return false;
    }
    static void printboard(char[][]board){
        for (int row=0;row< board.length;row++){
            for (int col=0;col<board[0].length;col++){
                System.out.print(board[row][col] +"|");
            }
            System.out.println();
        }
    }
}
