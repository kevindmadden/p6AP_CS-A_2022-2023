package Tetris;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    // Create a board
    // Is a block in the grid space?
    // 2d-Array of booleans
    // Objects are blocks, which are groups of board spaces
    public static void main(String[] args){
        Board[][] gameMat = new Board[20][20];
        String pieceType = null;
        Board board = new Board();


        // Game Loop
        StdDraw.setScale(0,200);
        StdDraw.enableDoubleBuffering();
        final double TIME_ELAPSED = 0.017;



        while(true){

            for(int row=0; row<gameMat.length; row++){
                for(int col=0; col<12; col++){
                    gameMat[row][col] = new Board();
                    Board.drawBoard(row,col);
                }
            }



            for (int i = 0; i < board.getBlockList().size(); i++) {
                if(board.getCurrentBlock().getBlockBottom()) {
                    board.getBlockList().add(Block.getBlock());
                    board.setCurrentBlock(board.getBlockList().get(board.getBlockList().size() - 1));
                }
                board.drawBlock(board.getBlockList().get(i));
            }

            board.getCurrentBlock().setRow(board.getCurrentBlock().getRow() - 1);

            StdDraw.show();
            StdDraw.pause((int) (TIME_ELAPSED * 1000));
            StdDraw.clear();
        }

    }

}
