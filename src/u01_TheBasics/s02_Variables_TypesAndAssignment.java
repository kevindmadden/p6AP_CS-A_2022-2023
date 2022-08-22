package u01_TheBasics;

/*
Relevant resources:
    Class textbook: Ch. 2.5-2.8
    Runestone: 1.3-1.4.1 - https://runestone.academy/ns/books/published/csawesome/Unit1-Getting-Started/toctree.html
    Oracle: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
*/

public class s02_Variables_TypesAndAssignment {
    public static void main(String[] args){
        //IDE - Integrated Development Environment

        //What is a variable in CS?
        //A variable is a container that stores something.

        //Literal Variable types: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        int a = 9;
        int A = 5;
        System.out.println(a);
        System.out.println(A); //prints 5
        //Changing the value of a variable
        A = 4;
        System.out.println(A); //prints 4


        double b = 9.6;

        boolean t = true; //true, false -- only two values possible
        String s = "this is some text";
        System.out.println(s);

        String messedUp = "The world revolves around dogs.";
        System.out.println(messedUp); //prints: The world revolves around dogs.

        char c = 'F'; //character - a single character in single quotes / Not on AP test

        //Final variables:
        final double pi = 3.14;
        //pi = 8.17; //this would give an error because you are trying to change the value of a variable that has been declared final

        //Declare (Creating) Variable
        int aVariable;

        //Initialize
        aVariable = 9;

        //Declare and Initialize
        int anotherVariable = 10;


    }





}
