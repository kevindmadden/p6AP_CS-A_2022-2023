package u01_TheBasics;

/*
Resources:
 Class text: 2.9, 2.14-2.16
 Runestone: 1.4-1.6 - https://runestone.academy/ns/books/published/csawesome/Unit1-Getting-Started/toctree.html
 */

public class s03_Operators {
    public static void main(String[] args){
        //5 Basic operators in Java: +, -, *, /, %

        //+ (-, * work similarly)
        System.out.println(1+2);
        int iWannaBe7 = 6;
        iWannaBe7 = iWannaBe7+1;
        System.out.println(iWannaBe7);

        // Division /
        System.out.println(7/2); //prints 3
        System.out.println(7.0/2); //print 3.5
        System.out.println(7/2.0); //print 3.5

        //int, double, boolean - primitive
        //String - object

        //Integer Division & Casting
        System.out.println(7/(double)2); //casting 2 to be a double value, prints 3.5
        int firstInt = 6;
        int secondInt = 5;
        System.out.println(firstInt+""+secondInt);

        //String operator
        String start = "The frog jumped over";
        String end = "the whale.";
        System.out.println(start+" "+end);


        //ArithmeticException Error
        //System.out.println(7/0); //running this causes and ArithmeticException error for committing the grave mistake of dividing by 0


        //Compound Operators
        //++, --
        int iIncrement = 3;
        System.out.println("iIncrement: "+iIncrement);
        iIncrement = iIncrement + 1; //adds 1 to iIncrement
        System.out.println("iIncrement: "+iIncrement);
        iIncrement++;
        System.out.println("iIncrement: "+iIncrement);

        //+=
        iIncrement+=2; //iIncrement = iIncrement + 2;
        System.out.println("iIncrement: "+iIncrement);

        //-=, *=, /=
        iIncrement-=2; //iIncrement = iIncrement - 2;
        iIncrement*=2; //iIncrement = iIncrement*2;
        iIncrement/=2; //iIncrement = iIncrement/2;

        // % - Modulus
        System.out.println(10%4); //prints 2 (remainder of 10/4)
        System.out.println(100%88); //prints 12 (remainder of 100/88)

        // %= - you'll probably never use this


    }
}
