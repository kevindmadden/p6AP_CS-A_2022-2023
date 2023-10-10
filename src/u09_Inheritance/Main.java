package u09_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Checker checker = new Checker("yellow");
        checker.printColor();
        King king = new King("red");
        king.printColor();

        checker.speak();
        king.speak();

        Object obj = new Object();
        System.out.println(king.toString());
        System.out.println(king);



    }
}
