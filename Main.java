import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    // getting input
    Scanner scanner = new Scanner(System.in);

    // colored output
    Text.clear();
    Text.smoothPrint("Welcome to 2-Player chess.\n");
    System.out.print(Colors.CYAN_BOLD_BRIGHT);
    System.out.println("Enter the name of the White (Cyan) Player: ");
    String user1 = scanner.nextLine();
    System.out.print(Colors.PURPLE_BOLD_BRIGHT);
    System.out.println("Enter the name of Black (Purple) Player: ");
    String user2 = scanner.nextLine();

    // create board object
    Board board = new Board();
    board.display();

    boolean turn = true;
    
    // main loop to run game
    while (true) {
      Text.clear();
      if (turn) {
        System.out.print(Colors.CYAN_BOLD_BRIGHT);
        Text.smoothPrint(user1 + "'s turn.\n");
      } else {
        System.out.print(Colors.PURPLE_BOLD_BRIGHT);
        Text.smoothPrint(user2 + "'s turn.\n");
      }
      if (board.move(scanner.nextLine())) {
        turn = !turn;
      }
      board.display();
      if (board.checkMate()) {
        break;
      }
    }

    System.out.print(Colors.WHITE_BOLD_BRIGHT);
    Text.smoothPrint("The game is over!\n");

  }
}