Made in collaboration with [Caleb Han](https://github.com/calebyhan).

To move a piece, simply enter its origin coordinate followed by its destination coordinate. For example, to move your d pawn, you could enter "d2d4".

Supports two-player chess. The objective of the game is to capture the opponent's king. It utilizes images to display the board. Includes support for most normal chess moves, with the exception of castling and en passant.

To view the game, have the "newBoard.png" image open in another tab in your IDE. It should update as pieces are moved.

Enjoy!

## Credits

[Pieces img source](https://commons.wikimedia.org/wiki/Category:PNG_chess_pieces/Standard_transparent)

[Board img source](https://stackoverflow.com/questions/61851521/how-to-detect-a-simple-2d-chessboard-with-pieces-on-it)

[Colors file source](https://www.w3schools.blog/ansi-colors-java)

## Code Information

```
Type IDs:
  WHITE:
    pawns: 1
    knights: 2
    bishops: 3
    rooks: 4
    queen: 5
    king: 6

  BLACK:
    pawns: -1
    knights: -2
    bishops: -3
    rooks: -4
    queen: -5
    king: -6
```
```
Piece IDs:
  ALL IN LEFT TO RIGHT
  WHITE:
    Pawn row: 1-8
    King row: 9-16
  WHITE:
    Pawn row: (﹣1)-(﹣8)
    King row: (﹣9)-(﹣16)
```
