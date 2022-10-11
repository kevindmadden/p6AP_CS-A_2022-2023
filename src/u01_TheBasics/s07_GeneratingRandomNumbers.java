package u01_TheBasics;

public class s07_GeneratingRandomNumbers {
    public static void main(String[] args){
        System.out.println( Math.random() ); //prints out a double value between 0 and 1
        System.out.println( Math.random()*2 ); //prints out a double value between 0 and 2
        System.out.println( Math.random()*10 ); //prints out a double value between 0 and 10
        System.out.println( Math.random()*10 + 10); //prints out a double value between 10 and 20
        System.out.println( (int)(Math.random()*10 + 10)); //prints out integer between 10 and 20
        System.out.println(Integer.MAX_VALUE);
    }
}