/*
 * Author : asaasahamed
 * Email : ahamedamhar07@gmail.com
 * Date : 22nd of jun 2024
 * Description : this just a fun game.
 */


 import java.util.Scanner;

 class Main {
   public static void main(String[] args) {
     char[][] board = new char[3][3];
     for (int row = 0; row < board.length; row++) {
       for (int col = 0; col < board[row].length; col++) {
         board[row][col] = ' ';
       }
     }
 
     char player = 'X';
     boolean gameOver = false;
     Scanner scanner = new Scanner(System.in);
 
     while (!gameOver) {
       printBoard(board);
       System.out.print("Player " + player + " enter: ");
       int row = scanner.nextInt();
       int col = scanner.nextInt();
       System.out.println();
 
       if (board[row][col] == ' ') {
         board[row][col] = player; // place the element
         gameOver = haveWon(board, player);
         if (gameOver) {
           System.out.println("Player " + player + " has won: ");
         } else {
           // if (player == 'X') {
           // player = 'O';
           // } else {
           // player = 'X';
           // }
           player = (player == 'X') ? 'O' : 'X';
         }
       } else {
         System.out.println("Invalid move. Try again!");
       }
     }
     printBoard(board);
   }
 
   public static boolean haveWon(char[][] board, char player) {
     // check the rows
     for (int row = 0; row < board.length; row++) {
       if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
         return true;
       }
     }
 
     // check for col
     for (int col = 0; col < board[0].length; col++) {
       if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
         return true;
       }
     }
 
     // diagonal
     if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
       return true;
     }
 
     if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
       return true;
     }
     return false;
   }
 
   public static void printBoard(char[][] board) {
     for (int row = 0; row < board.length; row++) {
       for (int col = 0; col < board[row].length; col++) {
         System.out.print(board[row][col] + " | ");
       }
       System.out.println();
     }
   }
 }

