package Tetris;

import java.awt.*;
import java.util.ArrayList;

public class Board {

    // Set first value in blockList
    private ArrayList<Block> blockList;
    private Block currentBlock;
    public Board(){
        blockList = new ArrayList<>();
        blockList.add(Block.getBlock());
        currentBlock = blockList.get(blockList.size() - 1);
    }


    public void drawBlock(Block thisShape){
        int coordHolder = -1;
        for(int i=0; i<4; i++) {
            coordHolder = currentBlock.getShapeCoords(thisShape.getPieceType(), thisShape.getRow(), thisShape.getCol())[i];
            StdDraw.filledSquare((coordHolder % 100 * 10) + 5 , (coordHolder / 100 * 10) + 5, 5);
        }
    }

    public static void drawBoard(int row, int col){
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(5+10*col,5+10*row,5);
    }


    public ArrayList<Block> getBlockList(){
        return blockList;
    }

    public Block getCurrentBlock(){
        return currentBlock;
    }

    public void setCurrentBlock(Block currentBlock){
        this.currentBlock = currentBlock;
    }

}