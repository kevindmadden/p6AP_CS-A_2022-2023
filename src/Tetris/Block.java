package Tetris;

import java.awt.*;

public class Block {
    // Block object should be a set of 4 points to plot on the board
    // Each block subclass will have a method to rotate the shape left 90 degrees...
    // And a method to move the block down faster

    static String[] pieceTypes = {"T", "L", "BL", "RZig", "LZig", "Sqr", "Line"};

    // Initiate
    private Color blockColor;
    private String pieceType;
    private int[] coords = new int[4];
    private int row;
    private int col;

    private final int bottom;

    boolean isBottom;


    public Block(String pieceType){
        this.pieceType = pieceType;
        row = 19;
        col = (int) (Math.random()*12);
        isBottom = false;
        bottom = 1;
    }

    public int getRow(){
        return row;
    }

    public void setRow(int row){
        this.row = row;
    }

    public int getCol(){
        return col;
    }

    public String getPieceType(){
        return pieceType;
    }

    public int[] getCoords(){
        return coords;
    }


    public int pointToInt(int row, int col){
        return row * 100 + col;
    }

    public int[] getShapeCoords(String pieceType, int centerRow, int centerCol){
        // Initialize row and col needed shift
        int rowNeededShift = 0;
        int colNeededShift = 0;

        coords[0] = pointToInt(centerRow, centerCol);
        if(pieceType.equals("T")){
            if(centerRow == 0) {
                rowNeededShift = 1;
            }
            if(centerCol == 0){
                colNeededShift = 1;
            }
            if(centerCol == 11){
                colNeededShift = -1;
            }
            coords[1] = pointToInt(centerRow, centerCol - 1);
            coords[2] = pointToInt(centerRow, centerCol + 1);
            coords[3] = pointToInt(centerRow - 1, centerCol);
            blockColor = StdDraw.RED;

        }
        if(pieceType.equals("L")){
            if(centerRow == 18){
                rowNeededShift = -1;
            }
            if(centerRow == 19){
                rowNeededShift = -2;
            }
            if(centerCol == 11){
                colNeededShift = -1;
            }
            coords[1] = pointToInt(centerRow, centerCol + 1);
            coords[2] = pointToInt(centerRow + 1, centerCol);
            coords[3] = pointToInt(centerRow + 2, centerCol);
            blockColor = StdDraw.ORANGE;
        }
        if(pieceType.equals("BL")){
            if(centerRow == 18){
                rowNeededShift = -1;
            }
            if(centerRow == 19){
                rowNeededShift = -2;
            }
            if(centerCol == 0) {
                colNeededShift = 1;
            }
            coords[1] = pointToInt(centerRow, centerCol - 1);
            coords[2] = pointToInt(centerRow + 1,centerCol);
            coords[3] = pointToInt(centerRow + 2, centerCol);
            blockColor = StdDraw.YELLOW;
        }
        if(pieceType.equals("RZig")){
            if(centerCol == 0){
                colNeededShift = 1;
            }
            if(centerRow == 19){
                rowNeededShift = -1;
            }
            if(centerCol == 11){
                colNeededShift = -1;
            }
            coords[1] = pointToInt(centerRow, centerCol - 1);
            coords[2] = pointToInt(centerRow + 1, centerCol);
            coords[3] = pointToInt(centerRow + 1, centerCol + 1);
            blockColor = StdDraw.GREEN;
        }
        if(pieceType.equals("LZig")){
            if(centerRow == 19){
                rowNeededShift = -1;
            }
            if(centerCol == 11){
                colNeededShift = -1;
            }
            if(centerCol == 0){
                colNeededShift = 1;
            }
            coords[1] = pointToInt(centerRow, centerCol + 1);
            coords[2] = pointToInt(centerRow + 1, centerCol);
            coords[3] = pointToInt(centerRow + 1, centerCol - 1);
            blockColor = StdDraw.CYAN;
        }
        if(pieceType.equals("Sqr")){
            if(centerRow == 19){
                rowNeededShift = -1;
            }
            if(centerCol == 11) {
                colNeededShift = -1;
            }
            coords[1] = pointToInt(centerRow, centerCol + 1);
            coords[2] = pointToInt(centerRow + 1, centerCol);
            coords[3] = pointToInt(centerRow + 1, centerCol + 1);
            blockColor = StdDraw.BLUE;
        }
        if(pieceType.equals("Line")){
            if(centerCol == 0){
                colNeededShift = 1;
            }
            if(centerCol == 10){
                colNeededShift = -1;
            }
            if(centerCol == 11){
                colNeededShift = -2;
            }
            coords[1] = pointToInt(centerRow, centerCol - 1);
            coords[2] = pointToInt(centerRow, centerCol + 1);
            coords[3] = pointToInt(centerRow, centerCol + 2);
            blockColor = StdDraw.PINK;
        }
        System.out.println(coords[0]);
        StdDraw.setPenColor(blockColor);


        // Recursive Call Test
        if(colNeededShift != 0 || rowNeededShift != 0) {
            getShapeCoords(pieceType, centerRow + rowNeededShift, centerCol + colNeededShift);
        }
        return coords;
    }

    public boolean getBlockBottom(){
        for(int squareCoord : coords){
            if (squareCoord / 100 <= bottom) {
                isBottom = true;
            }
        }
        return isBottom;
    }
    // public static String randomPieceType() {
    //  pieceType = pieceTypes[(int) (Math.random() * 7)];
    //    return pieceType;
    // }

    public static Block getBlock(){
        return new Block(pieceTypes[(int) (Math.random() * 7)]);
    }

}