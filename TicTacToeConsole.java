import java.util.Optional;
import java.util.Scanner;
/**
 * A classic 3x3 two-player game adapted for single-player mode
 * against the computer.
 * The player and the computer take turns marking Xs and Os on a grid.
 * The winner is the first to align three in a row (horizontally,
 * vertically, or diagonally).
 * <pre>
 * Implementation may be a basic AI using heuristics or
 * an unbeatable strategy using the Minimax algorithm.
 * </pre>
 * @version 2
 */
public class TicTacToeConsole {

	public static void main(String[] args) {
     System.out.println("Welcome to Tic-Tac-Toe!.");
     System.out.println("Objective: Be the first to get 3 of your marks in a row.");
     System.out.println("How to play: Take turns placing X or O on the 3x3 grid.");
 	 System.out.println("#############################################################################################\n"
			  +"# ====== ====== ## =====  ====== #  #   |  #       =====  ====== #  =====      # ======= #\n"
			  +"##  ||  #  || ## //         || #    # // \\\\ #    //         || #  //     \\\\   # ||       #\n"
			  +"##  ||  #  || # ||          || #   # //   \\\\ #  ||          || # ||       ||  # ||______ #\n"
			  +"##  ||  #  || # ||          || #  # //=====\\\\ # ||          || # ||       ||  # ||       #\n"
			  +"##  ||  #  || ## \\\\         || # # //       \\\\ # \\\\         || ## \\\\     //   # ||       #\n"
			  +"##  ||   ====== ## =====    || #  //         \\\\ #  =====    || ##   =====    ##  ======= #\n"
			  +"############################################################################################\n");    	


Scanner scan = new Scanner(System.in);
System.out.println("TICTACTOE\n\n");
System.out.println("Board Layout in Correspondence to Input Keys\n");
System.out.println("_7_|_8_|_9_\n" + "_4_|_5_|_6_\n" + " 1 | 2 | 3 \n");

String Board = ("___|___|___\n" + "___|___|___\n" + "   |   |   \n");
StringBuilder bd = new StringBuilder(Board);

System.out.print("Who's First? Enter x or o: ");
String inputVal = scan.nextLine().toLowerCase();

boolean xTurn = inputVal.equals("x");
boolean gameOver = false;
int moves = 0;

while (!gameOver && moves < 9) {
System.out.println("\nCurrent Board:");
System.out.println(Board);

if (xTurn) {
  System.out.print("X's Turn - Enter pos: ");
  String inputNumber = scan.nextLine();

  switch (inputNumber) {
      case "7": 
      	mark(bd, 1, 'x'); 
      	break;
      case "8": 
      	mark(bd, 5, 'x'); 
      	break;
      case "9": 
      	mark(bd, 9, 'x'); 
      	break;
      case "4": 
      	mark(bd, 13, 'x'); 
      	break;
      case "5": 
      	mark(bd, 17, 'x'); 
      	break;
      case "6": 
      	mark(bd, 21, 'x'); 
      	break;
      case "1": 
      	mark(bd, 25, 'x'); 
      	break;
      case "2": 
      	mark(bd, 29, 'x'); 
      	break;
      case "3": 
      	mark(bd, 33, 'x'); 
      	break;
      default:
          System.out.println("Invalid input : Try again");
          continue;
  }

  Board = bd.toString();
  moves++;
  if (checkWinner(Board, 'x')) {
      System.out.println(Board);
      System.out.println("\nPlayer X wins!");
      System.out.println("ooooooo  ooooo                        o8o                       \r\n"
      		+ " `8888    d8'                         `\"'                       \r\n"
      		+ "   Y888..8P         oooo oooo    ooo oooo  ooo. .oo.    .oooo.o \r\n"
      		+ "    `8888'           `88. `88.  .8'  `888  `888P\"Y88b  d88(  \"8 \r\n"
      		+ "   .8PY888.           `88..]88..8'    888   888   888  `\"Y88b.  \r\n"
      		+ "  d8'  `888b           `888'`888'     888   888   888  o.  )88b \r\n"
      		+ "o888o  o88888o          `8'  `8'     o888o o888o o888o 8\"\"888P' \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                \r\n"
      		+ "                                                                ");
      gameOver = true;
      break;
  }
  xTurn = false; // switch turn

} else {
  System.out.print("O's Turn - Enter pos: ");
  String inputNumber = scan.nextLine();

  switch (inputNumber) {
      case "7": 
      	mark(bd, 1, 'o'); 
      	break;
      case "8": 
      	mark(bd, 5, 'o'); 
      	break;
      case "9": 
      	mark(bd, 9, 'o'); 
      	break;
      case "4": 
      	mark(bd, 13, 'o'); 
      	break;
      case "5": 
      	mark(bd, 17, 'o'); 
      	break;
      case "6": 
      	mark(bd, 21, 'o'); 
      	break;
      case "1": 
      	mark(bd, 25, 'o'); 
      	break;
      case "2": 
      	mark(bd, 29, 'o'); 
      	break;
      case "3": 
      	mark(bd, 33, 'o'); 
      	break;
      default:
          System.out.println("Invalid input. Try again!");
          continue;
  }

  Board = bd.toString();
  moves++;
  if (checkWinner(Board, 'o')) {
      System.out.println(Board);
      System.out.println("\nPlayer O wins!");
      System.out.println("  .oooooo.                          o8o                       \r\n"
      		+ " d8P'  `Y8b                         `\"'                       \r\n"
      		+ "888      888      oooo oooo    ooo oooo  ooo. .oo.    .oooo.o \r\n"
      		+ "888      888       `88. `88.  .8'  `888  `888P\"Y88b  d88(  \"8 \r\n"
      		+ "888      888        `88..]88..8'    888   888   888  `\"Y88b.  \r\n"
      		+ "`88b    d88'         `888'`888'     888   888   888  o.  )88b \r\n"
      		+ " `Y8bood8P'           `8'  `8'     o888o o888o o888o 8\"\"888P' \r\n"
      		+ "                                                              \r\n"
      		+ "                                                              \r\n"
      		+ "                                                              ");
      gameOver = true;
      break;
  }
  xTurn = true; 
}

if (moves == 9 && !gameOver) {
  System.out.println(Board);
  System.out.println("\nIt's a tie!\n");
  System.out.println("ooooo     .   o8o                              ooooooooooooo  o8o            \r\n"
  		+ "`888'   .o8   `YP                              8'   888   `8  `\"'            \r\n"
  		+ " 888  .o888oo  '   .oooo.o       .oooo.             888      oooo   .ooooo.  \r\n"
  		+ " 888    888       d88(  \"8      `P  )88b            888      `888  d88' `88b \r\n"
  		+ " 888    888       `\"Y88b.        .oP\"888            888       888  888ooo888 \r\n"
  		+ " 888    888 .     o.  )88b      d8(  888            888       888  888    .o \r\n"
  		+ "o888o   \"888\"     8\"\"888P'      `Y888\"\"8o          o888o     o888o `Y8bod8P' \r\n"
  		+ "                                                                             \r\n"
  		+ "                                                                             \r\n"
  		+ "                                                                             ");
  gameOver = true;
}
}

scan.close();
System.out.println("\nGame Over. Thanks for playing!");
}


          


private static void mark(StringBuilder bd, int index, char mark) {
    if (bd.charAt(index) == 'x' || bd.charAt(index) == 'o') {
        System.out.println("That spot is already taken, enter correct: ");
    } else {
        bd.setCharAt(index, mark);
    }
}

private static boolean checkWinner(String board, char mark) {
    char[] arr = new char[9];
    arr[0] = board.charAt(1);
    arr[1] = board.charAt(5);
    arr[2] = board.charAt(9);
    arr[3] = board.charAt(13);
    arr[4] = board.charAt(17);
    arr[5] = board.charAt(21);
    arr[6] = board.charAt(25);
    arr[7] = board.charAt(29);
    arr[8] = board.charAt(33);

    int[][] winningselect = {
        {0,1,2}, {3,4,5}, {6,7,8},
        {0,3,6}, {1,4,7}, {2,5,8},
        {0,4,8}, {2,4,6}
    };

    for (int[] w : winningselect) {
        if (arr[w[0]] == mark && arr[w[1]] == mark && arr[w[2]] == mark)
            return true;
    }
    return false;
}

}

