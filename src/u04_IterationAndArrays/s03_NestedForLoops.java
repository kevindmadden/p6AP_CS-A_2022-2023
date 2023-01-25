package u04_IterationAndArrays;

public class s03_NestedForLoops{
    /*
    Chess
    Checkers (Make competing AI's at the end)
    Slot Machine
    *2048
    Snake
    Payday
    Uno
    Space invaders
    Pac-man
    Breakout
    A game
    Solitare
    Tetris
    Random Grid Generator - What do we do on grid?
    Racing game where different tracks stored in grid
    Candy Crush like game
    Bridge builder
    Mindless clicker game
    Sheep herder
    Minesweeper
    Farming Simulator
    Rhythm game
    Angry birds - store info about birds on right side in grid
    Terraria like game



    Conway's game of life
     */


    public static void main(String[] args){
        String[] desserts = {"ice cream","cookies","brownies","doughnuts","popsicles"};
        String[] fruits = {"strawberry", "cherry", "grape", "prune", "lemon"};

        for(int i=0; i<desserts.length; i++){

            for(int j=0; j<fruits.length; j++){
                System.out.println(fruits[j]+" "+desserts[i]);
            }

        }











        /*int[] nums = {10,20,30,40,50};
        for(int i=0; i<3; i++){
            for(int j=0; j<nums.length; j++){
                System.out.println(i+", "+nums[j]);
            }
        }

        System.out.println("---------");
        for(int j=0; j<nums.length; j++){
            for(int i=0; i<3; i++){
                System.out.println(i+", "+nums[j]);
            }
        }*/



    }
}
