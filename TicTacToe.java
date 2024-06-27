import java.util.*;
//jai mata di
//lets build a tic tac toe game backend:
public class TicTacToe{

    public static void main(String[] args) {
        
        //lets define a 3*3 matrix of type char
        char[][] board=new char[3][3];


        //here we are filling an empty matrix with space character
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
               board[row][col]=' ';
            }
        }

        char player='X';
        boolean gameOver=false;
        Scanner sc =new Scanner(System.in);
        
        //run this loop while game is not over
        while(!gameOver){
            printBoard(board);
            System.out.println("Player "+ player+ " turn:");
            //we are inputting the coordinates from the user
            int row=sc.nextInt();
            int col=sc.nextInt();

            try{
            if(board[row][col]==' '){
                if(player=='X'){
                    board[row][col]='X';
                }
                else{
                    board[row][col]='0';
                }
           
            

            gameOver=isGameOver(board,player);
            if(gameOver){
                System.out.println("Player "+player+" has won this game :)");
            }
            else{
                player=player=='X'?'0':'X';
            }

        }
        else{
                System.out.println("Invalid input! please try again!!");
            }
    } catch(Exception ex){
        ex.printStackTrace();
        System.out.println("Invalid input please try again!!");

    }

        }
        printBoard(board);
    }

    private static void printBoard(char[][] board) {
       for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
              System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }

    private static boolean isGameOver(char[][] board, char player) {

    //lets check if any row has qualified for win
    for(int row=0;row<board.length;row++){
            if(board[row][0]==player&&board[row][1]==player&&board[row][2]==player){
                return true;
            }
    }

    //lets check if any col has qualified for win
    for(int col=0;col<board[0].length;col++){
        if(board[0][col]==player&&board[1][col]==player&&board[2][col]==player){
                return true;
            }
    }

    //lets check if diagnol:1 has qualified for win
    if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
        return true;
    }

    //lets check if diagnol:2 has qualified for win
    if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
        return true;
    }

    return false;
    }

    
}